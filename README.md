# hibernate-CRUD-operations
CRUD Operations using Hibernate

App.java file is for storing the data
Retrieve.java is for showing data from data
Delete.java is for deleting the data
Update.java is for updating the data

For storing the data for the first time i.e craeting the table, 
change this property in hibernate.cfg.xml file from  <property name="hbm2ddl.auto">update</property> to
 <property name="hbm2ddl.auto">create</property>

 for rest of the operations i.e update,delete and retrieve , it must be  <property name="hbm2ddl.auto">update</property> so that everytime you run the program, a new table is not created by truncating the old one.
