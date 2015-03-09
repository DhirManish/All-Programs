 #
 # QT.sh
 # 
 # Copyright 2015 manishdhir <manishdhir@manishdhir-HP-d530-SFF-DG058A>
 # 
 # This program is free software; you can redistribute it and/or modify
 # it under the terms of the GNU General Public License as published by
 # the Free Software Foundation; either version 2 of the License, or
 # (at your option) any later version.
 # 
 # This program is distributed in the hope that it will be useful,
 # but WITHOUT ANY WARRANTY; without even the implied warranty of
 # MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 # GNU General Public License for more details.
 # 
 # You should have received a copy of the GNU General Public License
 # along with this program; if not, write to the Free Software
 # Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 # MA 02110-1301, USA.
 # 
 



wget http://download.qt-project.org/official_releases/qt/5.0/5.0.2/qt-linux-opensource-5.0.2-x86-offline.run
chmod +x qt-linux-opensource-5.0.2-x86-offline.run
./qt-linux-opensource-5.0.2-x86-offline.run
sudo apt-get install build-essential
sudo apt-get install mesa-common-dev
sudo apt-get install libglu1-mesa-dev -y
