#basic requires packages
sudo apt-get update
sudo apt-get install git-core curl zlib1g-dev build-essential libssl-dev libreadline-dev libyaml-dev libsqlite3-dev sqlite3 libxml2-dev libxslt1-dev libcurl4-openssl-dev python-software-properties

#Installing with rbenv is a simple two step process. First you install rbenv, and then ruby-build

cd
git clone git://github.com/sstephenson/rbenv.git .rbenv
echo 'export PATH="$HOME/.rbenv/bin:$PATH"' >> ~/.bashrc
echo 'eval "$(rbenv init -)"' >> ~/.bashrc
exec $SHELL

git clone git://github.com/sstephenson/ruby-build.git ~/.rbenv/plugins/ruby-build
echo 'export PATH="$HOME/.rbenv/plugins/ruby-build/bin:$PATH"' >> ~/.bashrc
exec $SHELL

rbenv install 2.1.3
rbenv global 2.1.3
ruby -v

#Configuring Git

git config --global color.ui true
git config --global user.name "YOUR NAME"
git config --global user.email "YOUR@EMAIL.com"
ssh-keygen -t rsa -C "YOUR@EMAIL.com"

#The next step is to take the newly generated SSH key and add it to your Github account.
#You want to copy and paste the output of the following command and paste it here. 

cat ~/.ssh/id_rsa.pub

#Once you've done this, you can check and see if it worked:

ssh -T git@github.com

#You should get a message like this:

#Hi excid3! You've successfully authenticated, but GitHub does not provide shell access.

#Installing Rails

sudo add-apt-repository ppa:chris-lea/node.js
sudo apt-get update
sudo apt-get install nodejs

gem install rails

#If you're using rbenv, you'll need to run the following command to make the rails executable available:

rbenv rehash


rails -v
# Rails 4.1.6


#Setting Up MySQL

sudo apt-get install mysql-server mysql-client libmysqlclient-dev

#Setting Up PostgreSQL

#For PostgreSQL, we're going to add a new repository to easily install a recent version of Postgres 9.3.

sudo sh -c "echo 'deb http://apt.postgresql.org/pub/repos/apt/ precise-pgdg main' > /etc/apt/sources.list.d/pgdg.list"
wget --quiet -O - http://apt.postgresql.org/pub/repos/apt/ACCC4CF8.asc | sudo apt-key add -
sudo apt-get update
sudo apt-get install postgresql-common
sudo apt-get install postgresql-9.3 libpq-dev

sudo -u postgres createuser chris -s

#Feel free to replace chris with your username.
# If you would like to set a password for the user, you can do the following
sudo -u postgres psql
postgres=# \password chris



#Final Steps

#And now for the moment of truth. Let's create your first Rails application:

#### If you want to use SQLite (not recommended)
rails new myapp

#### If you want to use MySQL
rails new myapp -d mysql

#### If you want to use Postgres
# Note that this will expect a postgres user with the same username
# as your app, you may need to edit config/database.yml to match the
# user you created earlier
rails new myapp -d postgresql

# Move into the application directory
cd myapp

# If you setup MySQL or Postgres with a username/password, modify the
# config/database.yml file to contain the username/password that you specified

# Create the database
rake db:create

rails server

#You can now visit http://localhost:3000 to view your new website!

#Now that you've got your machine setup, it's time to start building some Rails applications.

#If you received an error that said Access denied for user 'root'@'localhost' (using password: NO) 
#then you need to update your config/database.yml file to match the database username and password.
