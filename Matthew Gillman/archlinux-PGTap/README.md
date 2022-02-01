# PGTap installation on Archlinux

this is a list of steps to be taken to install PGTap.

* download pgTAP 1.2.0 via the default user with normal privileges
* now issue the command `sudo -iu postgres`
* from the postgres user copy pgtap-1.2.0.zip in the directory called ./ which will be the place where postgres normally stores every file locally. If the .zip file is in the Downloads folder in your home then the command to issue is `cp $HOME/Downloads/pgtap-1.2.0.zip ./`
* unzip the pgtap-1.2.0.zip you just copied. There is a tool called unzip and what essentially does is creating a folder called pgtap-1.2.0. The syntax is this 'unzip pgtap-1.2.0.zip'

the output you're expecting to get is something along these lines:

#### shell output
Archive:  pgtap-1.2.0.zip
6ca7aec6d7e9ddca05fcecba3ac9132a446e2511
   creating: pgtap-1.2.0/
  inflating: pgtap-1.2.0/Changes     
  inflating: pgtap-1.2.0/META.json   
  inflating: pgtap-1.2.0/Makefile    
  inflating: pgtap-1.2.0/README.md   
   creating: pgtap-1.2.0/compat/
   creating: pgtap-1.2.0/compat/10/
  inflating: pgtap-1.2.0/compat/10/pgtap--0.98.0--0.99.0.patch  
   creating: pgtap-1.2.0/compat/9.2/
  inflating: pgtap-1.2.0/compat/9.2/pgtap--0.95.0--0.96.0.patch  
   creating: pgtap-1.2.0/compat/9.4/
  inflating: pgtap-1.2.0/compat/9.4/pgtap--0.96.0--0.97.0.patch  
  inflating: pgtap-1.2.0/compat/9.4/pgtap--0.99.0--1.0.0.patch  
   creating: pgtap-1.2.0/compat/9.6/
  inflating: pgtap-1.2.0/compat/9.6/pgtap--0.97.0--0.98.0.patch  
  inflating: pgtap-1.2.0/compat/gencore  
  inflating: pgtap-1.2.0/compat/install-9.1.patch  
  inflating: pgtap-1.2.0/compat/install-9.2.patch  
  inflating: pgtap-1.2.0/compat/install-9.4.patch  
  inflating: pgtap-1.2.0/compat/install-9.6.patch  
   creating: pgtap-1.2.0/contrib/
  inflating: pgtap-1.2.0/contrib/pgtap.spec  
   creating: pgtap-1.2.0/doc/
  inflating: pgtap-1.2.0/doc/pgtap.mmd  
  inflating: pgtap-1.2.0/pgtap.control  
  inflating: pgtap-1.2.0/release.md  
   creating: pgtap-1.2.0/sql/
  inflating: pgtap-1.2.0/sql/pgtap--0.90.0--0.91.0.sql  
  inflating: pgtap-1.2.0/sql/pgtap--0.91.0--0.92.0.sql  
  inflating: pgtap-1.2.0/sql/pgtap--0.92.0--0.93.0.sql  
  inflating: pgtap-1.2.0/sql/pgtap--0.93.0--0.94.0.sql  
  inflating: pgtap-1.2.0/sql/pgtap--0.94.0--0.95.0.sql  
  inflating: pgtap-1.2.0/sql/pgtap--0.95.0--0.96.0.sql.in  
  inflating: pgtap-1.2.0/sql/pgtap--0.96.0--0.97.0.sql.in  
  inflating: pgtap-1.2.0/sql/pgtap--0.97.0--0.98.0.sql.in  
  inflating: pgtap-1.2.0/sql/pgtap--0.98.0--0.99.0.sql.in  
  inflating: pgtap-1.2.0/sql/pgtap--0.99.0--1.0.0.sql.in  
  inflating: pgtap-1.2.0/sql/pgtap--1.0.0--1.1.0.sql  
  inflating: pgtap-1.2.0/sql/pgtap--1.1.0--1.2.0.sql  
  inflating: pgtap-1.2.0/sql/pgtap--unpackaged--0.91.0.sql  
  inflating: pgtap-1.2.0/sql/pgtap.sql.in  
   creating: pgtap-1.2.0/test/
  inflating: pgtap-1.2.0/test/Dockerfile  
  inflating: pgtap-1.2.0/test/docker-compose.yml  
   creating: pgtap-1.2.0/test/expected/
  inflating: pgtap-1.2.0/test/expected/aretap.out  
 extracting: pgtap-1.2.0/test/expected/build.out  
  inflating: pgtap-1.2.0/test/expected/check.out  
  inflating: pgtap-1.2.0/test/expected/cmpok.out  
  inflating: pgtap-1.2.0/test/expected/coltap.out  
 extracting: pgtap-1.2.0/test/expected/create.out  
  inflating: pgtap-1.2.0/test/expected/do_tap.out  
  inflating: pgtap-1.2.0/test/expected/enumtap.out  
  inflating: pgtap-1.2.0/test/expected/extension.out  
  inflating: pgtap-1.2.0/test/expected/fktap.out  
  inflating: pgtap-1.2.0/test/expected/functap.out  
  inflating: pgtap-1.2.0/test/expected/hastap.out  
  inflating: pgtap-1.2.0/test/expected/index.out  
  inflating: pgtap-1.2.0/test/expected/inheritance.out  
  inflating: pgtap-1.2.0/test/expected/inheritance_1.out  
  inflating: pgtap-1.2.0/test/expected/inheritance_2.out  
  inflating: pgtap-1.2.0/test/expected/inheritance_3.out  
  inflating: pgtap-1.2.0/test/expected/istap.out  
  inflating: pgtap-1.2.0/test/expected/matching.out  
  inflating: pgtap-1.2.0/test/expected/moretap.out  
  inflating: pgtap-1.2.0/test/expected/ownership.out  
  inflating: pgtap-1.2.0/test/expected/partitions.out  
  inflating: pgtap-1.2.0/test/expected/performs_ok.out  
  inflating: pgtap-1.2.0/test/expected/performs_within.out  
  inflating: pgtap-1.2.0/test/expected/pg73.out  
  inflating: pgtap-1.2.0/test/expected/pktap.out  
  inflating: pgtap-1.2.0/test/expected/policy.out  
  inflating: pgtap-1.2.0/test/expected/privs.out  
  inflating: pgtap-1.2.0/test/expected/proctap.out  
  inflating: pgtap-1.2.0/test/expected/resultset.out  
  inflating: pgtap-1.2.0/test/expected/roletap.out  
  inflating: pgtap-1.2.0/test/expected/ruletap.out  
  inflating: pgtap-1.2.0/test/expected/runjusttests.out  
  inflating: pgtap-1.2.0/test/expected/runjusttests_1.out  
  inflating: pgtap-1.2.0/test/expected/runjusttests_2.out  
  inflating: pgtap-1.2.0/test/expected/runjusttests_3.out  
  inflating: pgtap-1.2.0/test/expected/runjusttests_4.out  
  inflating: pgtap-1.2.0/test/expected/runjusttests_5.out  
  inflating: pgtap-1.2.0/test/expected/runjusttests_6.out  
  inflating: pgtap-1.2.0/test/expected/runnotests.out  
  inflating: pgtap-1.2.0/test/expected/runtests.out  
  inflating: pgtap-1.2.0/test/expected/runtests_1.out  
  inflating: pgtap-1.2.0/test/expected/runtests_2.out  
  inflating: pgtap-1.2.0/test/expected/runtests_3.out  
  inflating: pgtap-1.2.0/test/expected/runtests_4.out  
  inflating: pgtap-1.2.0/test/expected/runtests_5.out  
  inflating: pgtap-1.2.0/test/expected/runtests_6.out  
  inflating: pgtap-1.2.0/test/expected/throwtap.out  
  inflating: pgtap-1.2.0/test/expected/todotap.out  
  inflating: pgtap-1.2.0/test/expected/trigger.out  
  inflating: pgtap-1.2.0/test/expected/unique.out  
  inflating: pgtap-1.2.0/test/expected/update.out  
  inflating: pgtap-1.2.0/test/expected/usergroup.out  
  inflating: pgtap-1.2.0/test/expected/util.out  
  inflating: pgtap-1.2.0/test/expected/valueset.out  
  inflating: pgtap-1.2.0/test/psql.sql  
  inflating: pgtap-1.2.0/test/run    
   creating: pgtap-1.2.0/test/schedule/
  inflating: pgtap-1.2.0/test/schedule/build.sql  
 extracting: pgtap-1.2.0/test/schedule/create.sql  
  inflating: pgtap-1.2.0/test/schedule/main.sch  
 extracting: pgtap-1.2.0/test/schedule/update.sch  
  inflating: pgtap-1.2.0/test/schedule/update.sql  
 extracting: pgtap-1.2.0/test/setup.sql  
   creating: pgtap-1.2.0/test/sql/
  inflating: pgtap-1.2.0/test/sql/aretap.sql  
  inflating: pgtap-1.2.0/test/sql/check.sql  
  inflating: pgtap-1.2.0/test/sql/cmpok.sql  
  inflating: pgtap-1.2.0/test/sql/coltap.sql  
  inflating: pgtap-1.2.0/test/sql/do_tap.sql  
  inflating: pgtap-1.2.0/test/sql/enumtap.sql  
  inflating: pgtap-1.2.0/test/sql/extension.sql  
  inflating: pgtap-1.2.0/test/sql/fktap.sql  
  inflating: pgtap-1.2.0/test/sql/functap.sql  
  inflating: pgtap-1.2.0/test/sql/hastap.sql  
  inflating: pgtap-1.2.0/test/sql/index.sql  
  inflating: pgtap-1.2.0/test/sql/inheritance.sql  
  inflating: pgtap-1.2.0/test/sql/istap.sql  
  inflating: pgtap-1.2.0/test/sql/matching.sql  
  inflating: pgtap-1.2.0/test/sql/moretap.sql  
  inflating: pgtap-1.2.0/test/sql/ownership.sql  
  inflating: pgtap-1.2.0/test/sql/partitions.sql  
  inflating: pgtap-1.2.0/test/sql/performs_ok.sql  
  inflating: pgtap-1.2.0/test/sql/performs_within.sql  
  inflating: pgtap-1.2.0/test/sql/pg73.sql  
  inflating: pgtap-1.2.0/test/sql/pktap.sql  
  inflating: pgtap-1.2.0/test/sql/policy.sql  
  inflating: pgtap-1.2.0/test/sql/privs.sql  
  inflating: pgtap-1.2.0/test/sql/proctap.sql  
  inflating: pgtap-1.2.0/test/sql/resultset.sql  
  inflating: pgtap-1.2.0/test/sql/roletap.sql  
  inflating: pgtap-1.2.0/test/sql/ruletap.sql  
  inflating: pgtap-1.2.0/test/sql/runjusttests.sql  [this](https://github.com/danieledellacioppa/ACL-Assignments/tree/archlinux_postgres_long_installation/Matthew%20Gillman/archlinux-postgres/one-step-installation)
  inflating: pgtap-1.2.0/test/sql/runnotests.sql  
  inflating: pgtap-1.2.0/test/sql/runtests.sql  
  inflating: pgtap-1.2.0/test/sql/throwtap.sql  
  inflating: pgtap-1.2.0/test/sql/todotap.sql  
  inflating: pgtap-1.2.0/test/sql/trigger.sql  
  inflating: pgtap-1.2.0/test/sql/unique.sql  
  inflating: pgtap-1.2.0/test/sql/usergroup.sql  
  inflating: pgtap-1.2.0/test/sql/util.sql  
  inflating: pgtap-1.2.0/test/sql/valueset.sql  
  inflating: pgtap-1.2.0/test/test_MVU.sh  
   creating: pgtap-1.2.0/tools/
  inflating: pgtap-1.2.0/tools/getos.sh  
  inflating: pgtap-1.2.0/tools/missing_extensions.sh  
  inflating: pgtap-1.2.0/tools/parallel_conn.sh  
  inflating: pgtap-1.2.0/tools/psql_args.sh  
  inflating: pgtap-1.2.0/tools/util.sh  

---

What is basically happening here we're extracting the .zip file and creating a folder called pgtap-1.2.0. Let's now change directory and move inside of the pgtap-1.2.0 directory which is what we just created with the unzip command:
  

```
cd pgtap-1.2.0
```

Let's make sure you're in the right place and let's issue this command `ls *`.
The output you want is something like this:

#### shell output

Changes  Makefile  META.json  pgtap.control  README.md  release.md

compat:
10   9.4  gencore            install-9.2.patch  install-9.6.patch
9.2  9.6  install-9.1.patch  install-9.4.patch

contrib:
pgtap.spec

doc:
pgtap.mmd

sql:
pgtap--0.90.0--0.91.0.sql     pgtap--0.97.0--0.98.0.sql.in
pgtap--0.91.0--0.92.0.sql     pgtap--0.98.0--0.99.0.sql.in
pgtap--0.92.0--0.93.0.sql     pgtap--0.99.0--1.0.0.sql.in
pgtap--0.93.0--0.94.0.sql     pgtap--1.0.0--1.1.0.sql
pgtap--0.94.0--0.95.0.sql     pgtap--1.1.0--1.2.0.sql
pgtap--0.95.0--0.96.0.sql.in  pgtap.sql.in
pgtap--0.96.0--0.97.0.sql.in  pgtap--unpackaged--0.91.0.sql

test:
docker-compose.yml  expected  run       setup.sql  test_MVU.sh
Dockerfile          psql.sql  schedule  sql

tools:

---

### it's now time to MAKE


If we are at this stage it means we're indeed ready to issue the ` make` command and start building the source code by issuing the following command:

```
make install
```

but when I've done it on my platform this was the output :


#### output on my machine
make install

GNUmake running against Postgres version 13.4, with pg_config located at /usr/bin

Makefile:186: To use pg_prove, TAP::Parser::SourceHandler::pgTAP Perl module
Makefile:187: must be installed from CPAN. To do so, simply run:
Makefile:188: cpan TAP::Parser::SourceHandler::pgTAP
/usr/bin/mkdir -p '/usr/share/postgresql/extension'
/usr/bin/mkdir -p '/usr/share/postgresql/extension'
/usr/bin/mkdir -p '/usr/share/doc/postgresql/extension'
/usr/bin/install -c -m 644 .//pgtap.control '/usr/share/postgresql/extension/'
/usr/bin/install: cannot create regular file '/usr/share/postgresql/extension/pgtap.control': Permission denied
make: *** [/usr/lib/postgresql/pgxs/src/makefiles/pgxs.mk:232: install] Error 1

---

my decision in the past was to install pg_prove via CPAN but I'll try to give postgres move privileges first


What we need to do here is running 

```
sudo visudo
```

and when vi opens give to postgres user the same privileges as root.
What we have to do here essentially is adding somewhere this line


```
postgres ALL=(ALL:ALL) ALL
```


then we can issue:
```
sudo make install
```

and then the following command (NOT FROM SUPERUSER)

```
make installcheck
```


and here is the output of both commands issued above:


#### output 

>GNUmake running against Postgres version 13.4, with pg_config located at /usr/bin      
  Makefile:186: To use pg_prove, TAP::Parser::SourceHandler::pgTAP Perl module      
  Makefile:187: must be installed from CPAN. To do so, simply run:    
  Makefile:188: cpan TAP::Parser::SourceHandler::pgTAP   
  Using 89 parallel test connections   
  Rebuilding test/build/all_tests   
  Schedule changed to test/build/parallel.sch   
  cp 'cat test/build/which_schedule' test/build/run.sch   
  /usr/lib/postgresql/pgxs/src/makefiles/../../src/test/regress/pg_regress --inputdir=./ --bindir='/usr/bin'    --inputdir=test --max-connections=89 --schedule test/schedule/main.sch   --schedule test/build/run.sch    
  (using postmaster on Unix socket, default port)   
  ============== dropping database "regression"         ==============   
  NOTICE:  database "regression" does not exist, skipping   
  DROP DATABASE   
  ============== creating database "regression"         ==============   
  CREATE DATABASE   
  ALTER DATABASE   
  ============== running regression test queries        ==============   
  test build                        ... ok          249 ms   
  test create                       ... ok          148 ms   
  test coltap                       ... ok          253 ms   
  test hastap                       ... ok          918 ms   
  parallel group (35 tests):  performs_ok cmpok do_tap istap performs_within pg73 moretap util matching todotap roletap check usergroup enumtap throwtap runtests trigger extension runnotests proctap policy runjusttests fktap privs inheritance partitions valueset aretap functap ownership resultset unique index pktap ruletap   
       aretap                       ... ok         2093 ms   
       check                        ... ok          348 ms   
       cmpok                        ... ok          172 ms   
       do_tap                       ... ok          178 ms   
       enumtap                      ... ok          440 ms   
       extension                    ... ok          471 ms   
       fktap                        ... ok          695 ms   
       functap                      ... ok         3079 ms   
       index                        ... ok         4098 ms   
       inheritance                  ... ok          902 ms   
       istap                        ... ok          183 ms   
       matching                     ... ok          262 ms   
       moretap                      ... ok          250 ms   
       ownership                    ... ok         3585 ms   
       partitions                   ... ok         1029 ms   
       performs_ok                  ... ok          121 ms    
       performs_within              ... ok          209 ms   
       pg73                         ... ok          224 ms   
       pktap                        ... ok         4220 ms   
       policy                       ... ok          569 ms   
       privs                        ... ok          778 ms   
       proctap                      ... ok          552 ms   
       resultset                    ... ok         3679 ms   
       roletap                      ... ok          284 ms   
       ruletap                      ... ok         4363 ms   
       runjusttests                 ... ok          580 ms   
       runnotests                   ... ok          497 ms   
       runtests                     ... ok          445 ms   
       throwtap                     ... ok          439 ms   
       todotap                      ... ok          282 ms   
       trigger                      ... ok          455 ms   
       unique                       ... ok         3711 ms   
       usergroup                    ... ok          420 ms   
       util                         ... ok          256 ms   
       valueset                     ... ok         1145 ms   
  ======================   
  All 39 tests passed.    
  [postgres@alpha pgtap-1.2.0]$    



---


the installation looks like it went fine.


What I'm going to do is create an extension in the database

```
create extension if not exists pgtap;
```


and then create a test.sql file with the pgTAP sample Test Script in it but the position of pgtap.sql needs to be specified after \i.

in order to do it I need the **mlocate** package which updatedb depends from

```
sudo pacman -S mlocate
```

now i can issue updatedb to create a database of all the files in the partition I'm in

and then issue locate X

where X is the name of the file I'm looking for


#### output of `locate pgtap.sql`



/home/daniele/Downloads/pgtap-1.2.0/sql/pgtap.sql.in
/usr/share/postgresql/extension/pgtap.sql
/usr/share/postgresql/extension/uninstall_pgtap.sql
/var/lib/postgres/pgtap-1.2.0/sql/pgtap.sql
/var/lib/postgres/pgtap-1.2.0/sql/pgtap.sql.in
/var/lib/postgres/pgtap-1.2.0/sql/uninstall_pgtap.sql


---



I've put one of these after the \i in the test.sql

and then run


```
psql -d gen2test -Xf test.sql
```

#### output 


1..1
ok 1 - My test passed, w00t!

---


let's now try to state the **9 * 9 = 81** and then **9 * 9 = 82**

the syntax I'm going to use is


```
SELECT ok( 9 ^ 2 = 81,    'simple exponential' );
```

I've called the function stating **9 * 9 = 81** expected and the one stating **9 * 9 = 82** unexpected

#### the output


1..2
ok 1 - expected result
not ok 2 - unexpected result
**Failed test 2: "unexpected result"**
**Looks like you failed 1 test of 2**

--- 
