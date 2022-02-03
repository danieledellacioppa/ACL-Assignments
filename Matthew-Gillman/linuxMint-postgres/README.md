# one step installation

let's try to summarize the essential steps to make sure postgres is installed flawlessly on every linux system with more stability than archlinux

```
sudo apt-get install postgresql
```

postgres installed now let's login with the postgres user

```
sudo -iu postgres
```

now that you're logged in issu the command:

```
psql
```

this is what you should get hopefully

```
psql (12.9(Ubuntu 12.9-0ubuntu0.20.04.01)) 
Type "help" for help.

postgres=# 
```

that means you're in
