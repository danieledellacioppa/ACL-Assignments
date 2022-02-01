# archlinux postgres installation

in this document we are going through all the steps I historically needed to install postgres on ArchLinux. Before reading this guide is encouraged to go through [this](https://github.com/danieledellacioppa/ACL-Assignments/tree/archlinux_postgres_long_installation/Matthew%20Gillman/archlinux-postgres/one-step-installation) guide first and then come on this page if you get any issues


```
sudo pacman -S postgresql
```

output

```
resolving dependencies...
looking for conflicting packages...

Packages (2) postgresql-libs-13.4-6  postgresql-13.4-6

Total Download Size:   18.36 MiB
Total Installed Size:  59.23 MiB

:: Proceed with installation? [Y/n]      
```

``
sudo passwd postgres
```
then
change the password

```
sudo -iu postgres
```


the command ```psql```

gives the error

```
psql: error: could not connect to server: No such file or directory
	Is the server running locally and accepting
	connections on Unix domain socket "/run/postgresql/.s.PGSQL.5432"?
```

let us initialize the database cluster by issuing this command

```
initdb -D /var/lib/postgres/data
```

and here you can find the output

```
[postgres@daniele-virtualbox ~]$ initdb -D /var/lib/postgres/data
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

```

as you can see all is being done from the postgres user as it will be the only user meant to be using the database

```
pg_ctl -D /var/lib/postgres/data -l logfile start
```

```
waiting for server to start..../bin/sh: line 1: logfile: Permission denied
 stopped waiting
pg_ctl: could not start server
Examine the log output.
```

let us make postgres a sudoer

```
systemctl status postgresql.service
```

gives


```
○ postgresql.service - PostgreSQL database server
     Loaded: loaded (/usr/lib/systemd/system/postgresql.service; disabled; vendor preset: disabled)
     Active: inactive (dead)
```


this command then gets issued from the postgres user

```
initdb --locale=en_US.UTF-8 -E UTF8 -D /var/lib/postgres/data

```

```
initdb: error: directory "/var/lib/postgres/data" exists but is not empty
If you want to create a new database system, either remove or empty
the directory "/var/lib/postgres/data" or run initdb
with an argument other than "/var/lib/postgres/data".
```

ideally i'll try to remove or empty the directory mentioned above


```
sudo mkdir /var/lib/postgres/data

sudo chown postgres:postgres /var/lib/postgres/data

sudo -u postgres initdb -D /var/lib/postgres/data
```

this one was the output

```
mkdir: cannot create directory ‘/var/lib/postgres/data’: File exists
could not change directory to "/home/daniele": Permission denied
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

initdb: error: directory "/var/lib/postgres/data" exists but is not empty
If you want to create a new database system, either remove or empty
the directory "/var/lib/postgres/data" or run initdb
with an argument other than "/var/lib/postgres/data".
```

I removed the data folder with sudo privileges
added postgres to the sudoers and rebooted
then issued the commands again

```
sudo mkdir /var/lib/postgres/data

sudo chown postgres:postgres /var/lib/postgres/data

sudo -u postgres initdb -D /var/lib/postgres/data
```



```
postgresql-setup --initdb
systemctl restart postgresql.service
systemctl enable postgresql.service
```


