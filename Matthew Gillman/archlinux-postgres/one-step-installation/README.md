# one step installation

let's try to summarize the essential steps to make sure postgres is installed flawlessly on every linux system with more stability than archlinux

```
sudo pacman -S postgresql
```

with this command the user postgres gets created so let us put it in the sudoers straight away and let us assign a password to it

```
sudo passwd postgres
```

```
sudo visudo 
```

now give to postgres the same privilegs as root. Just copy whatever is stated for root and replace root with postgres and then you can save and exit the vi environment

```
sudo -iu postgres
```

#### shell output
[postgres@daniele-virtualbox2 ~]$ psql
psql: error: could not connect to server: No such file or directory
	Is the server running locally and accepting
	connections on Unix domain socket "/run/postgresql/.s.PGSQL.5432"?

---

```
initdb -D /var/lib/postgres/data
```


the output is this

### shell output
The files belonging to this database system will be owned by user "postgres".
This user must also own the server process.

The database cluster will be initialized with locales
  COLLATE:  en_GB.utf8
  CTYPE:    en_GB.utf8
  MESSAGES: en_GB.utf8
  MONETARY: en_GB.UTF-8
  NUMERIC:  en_GB.UTF-8
  TIME:     en_GB.UTF-8
The default database encoding has accordingly been set to "UTF8".
The default text search configuration will be set to "english".

Data page checksums are disabled.

fixing permissions on existing directory /var/lib/postgres/data ... ok
creating subdirectories ... ok
selecting dynamic shared memory implementation ... posix
selecting default max_connections ... 100
selecting default shared_buffers ... 128MB
selecting default time zone ... Europe/London
creating configuration files ... ok
running bootstrap script ... ok
performing post-bootstrap initialization ... ok
syncing data to disk ... ok

initdb: warning: enabling "trust" authentication for local connections
You can change this by editing pg_hba.conf or using the option -A, or
--auth-local and --auth-host, the next time you run initdb.

Success. You can now start the database server using:
pg_ctl -D /var/lib/postgres/data -l logfile start


---


```
pg_ctl -D /var/lib/postgres/data -l logfile start

```


gives the following error



#### error output

waiting for server to start..../bin/sh: line 1: logfile: Permission denied
 stopped waiting
pg_ctl: could not start server
Examine the log output.

---


```
systemctl restart postgresql.service
systemctl enable postgresql.service

```


the output was

#### shell output

Created symlink /etc/systemd/system/multi-user.target.wants/postgresql.service → /usr/lib/systemd/system/postgresql.service.

---


```
psql
```

this is what you should get hopefully

#### shell postgres output

psql (13.4)
Type "help" for help.

postgres=# 

---

### you're all done

If you got the output above that means you're in
