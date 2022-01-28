# PGTap installation on Archlinux

pgTAP download pgTAP 1.2.0
unzip pgtap-1.2.0.zip
cd pgtap-1.2.0
sudo -iu postgres
move all the stuff in the postgres user via the postgres user
cd pgtap
make

```
make install
```

and this is the output



```
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

```

my decision in the past was to install pg_prove via CPAN but I'll try to give postgres move privileges first


sudo visudo --add postgres as root user with all privileges


then I issue:
sudo make install
make installcheck

and here is the output:

```
GNUmake running against Postgres version 13.4, with pg_config located at /usr/bin

Makefile:186: To use pg_prove, TAP::Parser::SourceHandler::pgTAP Perl module
Makefile:187: must be installed from CPAN. To do so, simply run:
Makefile:188: cpan TAP::Parser::SourceHandler::pgTAP
Using 89 parallel test connections
Rebuilding test/build/all_tests
Schedule changed to test/build/parallel.sch
cp `cat test/build/which_schedule` test/build/run.sch
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
======================

[postgres@alpha pgtap-1.2.0]$ 


```


the installation looks like it went fine.



```
prova
```
