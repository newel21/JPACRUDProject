## Skill Distillery Weekend Project (Week 8): JPACRUDProject

### Project Information:
This project is about a Database of Developers. You can Create (add), Read, Update (edit), and Delete developers from the database. The information (fields) that you will need are the following:
   1. First Name (Cannot be null)
   2. Last Name (cannot be null)
   3. Gender (cannot be null)
   4. Category (Level of expertise)
   5. Learned By (How they learned to code)
   6. School Attended (If they did not go to college, you can leave it blank)
   7. Favorite Language (Pick others if the language is not on the options)
   8. *** ID is auto-incremented so you do not have to enter it.

### How the program works:
1. You can search developers by entering their ID on the search by ID box. There are currently 3 developers on file so you can use IDs 1, 2, and 3 for testing purposes. If you enter and ID that is
not in the database, then it will prompt you with the appropriate message.

2. You can view the list of developers on file by click the "view" button on the "Developers on File" section. It will show you a list of developers in a form of hyperlinks in which you can view the details by clicking each hyperlinks. If you decide to add more developers to the file, you will
see it added to the list.

3. You can add a developer to the database by providing the necessary information on the "Add Developer" section. As mentioned above, the first 3 fields requires an entry, while the rest can be left blank. I also provided some options to some of the fields for some guidance for testing purposes. Once you click the "Add" button, it will prompt you to a page that shows that details of the developer you just added.

4. You can delete developers from the database by entering the ID in the search box on the "Delete by ID" section. Try to add a new developer first. You can also delete a developer  by clicking the "Delete" button on each developer's profile.

5. You can update or edit a developer by clicking the "Edit" button shown in the developer's profile. There's a little bit of an issue to this that I still can't resolve so I'm willing to take a half credit. On the DeveloperController.java file on line 89, I couldn't figure out how to make the id parameter dynamic, so I hard coded Id: 1 for testing purposes. Which means you can only edit/Update the developer with id: 1.

### Technologies used:
JPA
Spring MVC
MySQL(SQL)
HTML
gradle
