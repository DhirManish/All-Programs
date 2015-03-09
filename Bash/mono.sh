apt-get install gcc g++ bison gettext make
cd /usr/local/src
wget http://download.mono-project.com/sources/mono/mono-2.10.8.tar.gz
tar zxvf mono-2.10.8.tar.gz
cd mono-2.10.8
./configure --prefix=/usr/local
make && make install
