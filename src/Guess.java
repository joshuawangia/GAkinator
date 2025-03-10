import java.util.ArrayList;


public class Guess {
 public ArrayList <Teacher> Teachers = new ArrayList<>();
 int countQ = 0;
 
    public Guess(){
        //Art
        Teachers.add(new Teacher(false, "Art", "T", true, "black", false, false, "Sara Ritz"));
        Teachers.add(new Teacher(true, "Art", null, false, null, false, true, "David Love"));
        Teachers.add(new Teacher(true, "Art", null, true, "black", false, true, "Dainis Roman"));
        Teachers.add(new Teacher(true, "Art", "K", true, "brown", false, true, "Nicholas Wynia"));
        //Chinese
        Teachers.add(new Teacher(false, "Chinese", "AD", true, "black", true, false, "Tsung Tsai"));
        //Classics
        Teachers.add(new Teacher(true, "Classics", "O", true, "gray", false, false, "Adam Leven"));
        Teachers.add(new Teacher(false, "Classics", "T", true, "brown", false, false, "Lindsey Stamer"));
        //English
        Teachers.add(new Teacher(false, "English", "G", true, "blonde", false, false, "Claire Barwise"));
        Teachers.add(new Teacher(false, "English", null, true, "brown", false, false, "Rebecca Burnett"));
        Teachers.add(new Teacher(false, "English", "K", true, "brown", true, false, "Alicia Evans"));
        Teachers.add(new Teacher(true, "English", "R", true, "brown", false, false, "Michael Ferrier"));
        Teachers.add(new Teacher(false, "English", null, true, "brown", false, false, "Michelle Friedman"));
        Teachers.add(new Teacher(false, "English", "O", true, "gray", true, false, "Robyn Graffam"));
        Teachers.add(new Teacher(true, "English", "O", true, "gray", false, false, "Daniel Keefe"));
        Teachers.add(new Teacher(false, "English", "AD", true, "brown", true, false, "Kara McPhillips"));
        Teachers.add(new Teacher(false, "English", "R", true, "black", true, false, "Antoinette Peters"));
        Teachers.add(new Teacher(true, "English", "G", true, "brown", false, false, "Michael Torrey"));
        Teachers.add(new Teacher(false, "English", "T", true, "brown", true, false, "Helga Vutz"));
        //History
        Teachers.add(new Teacher(true, "History", "G", false, null, false, false, "Roxie Bratton"));
        Teachers.add(new Teacher(true, "History", "O", true, "brown", false, true, "Kyle Donahue"));
        Teachers.add(new Teacher(false, "History", "K", true, "brown", true, false, "Julie Kimmel"));
        Teachers.add(new Teacher(false, "History", "O", true, "blonde", false, false, "Sarah Lloyd"));
        Teachers.add(new Teacher(false, "History", "R", true, "brown", false, false, "Maggie May"));
        Teachers.add(new Teacher(true, "History", "AD", true, "blonde", true, false, "Robert Moyer"));
        Teachers.add(new Teacher(true, "History", "T", true, "gray", false, false, "Jamie Murray"));
        Teachers.add(new Teacher(true, "History", "W", true, "gray", true, true, "Mark Rabuck"));
        Teachers.add(new Teacher(true, "History", "O", true, "brown", true, false, "Roxie Bratton"));
        //Mathematics
        Teachers.add(new Teacher(false, "Math", "AD", true, "blonde", false, false, "Peggy Bradley"));
        Teachers.add(new Teacher(false, "Math", "G", true, "black", false, false, "Diana Caramanico"));
        Teachers.add(new Teacher(true, "Math", "T", true, "gray", false, true, "Paul Henry"));
        Teachers.add(new Teacher(false, "Math", "G", true, "brown", true, false, "Lauren Lesch"));
        Teachers.add(new Teacher(true, "Math", null, true, "brown", false, true, "Steven Moll"));
        Teachers.add(new Teacher(true, "Math", "K", true, "gray", true, false, "Kevin Mylod"));
        Teachers.add(new Teacher(true, "Math", "W", true, "brown", false, false, "Chris Nelson"));
        Teachers.add(new Teacher(false, "Math", "R", true, "brown", false, false, "Allison Rader"));
        Teachers.add(new Teacher(true, "Math", "G", false, null, false, false, "Jason Straub"));
        Teachers.add(new Teacher(true, "Math", "W", true, "black", false, false, "Joe Taylor"));
        Teachers.add(new Teacher(true, "Math", "O", true, "brown", false, false, "Henry Wadsworth"));
        Teachers.add(new Teacher(true, "Math", "W", true, "brown", false, true, "Peter Winsniewski"));
        //Spanish
        Teachers.add(new Teacher(true, "Spanish", "G", true, "brown", false, true, "Carlos Chubb"));
        Teachers.add(new Teacher(true, "Spanish", "W", true, "black", false, false, "Axel Galeano"));
        Teachers.add(new Teacher(false, "Spanish", "K", true, "black", false, false, "Angela Gonzales"));
        Teachers.add(new Teacher(true, "Spanish", "K", true, "black", false, false, "Juan Leon"));
        Teachers.add(new Teacher(true, "Spanish", "W", true, "black", false, false, "Axel Galeano"));
        Teachers.add(new Teacher(false, "Spanish", "O", true, "black", false, false, "Jedi Dudurich"));
        //French
        Teachers.add(new Teacher(true, "French", "AD", false, null, false, true, "Adam Fisher"));
        Teachers.add(new Teacher(false, "French", "G", true, "brown", false, false, "Sonia Robin"));
        //Phys. Ed.
        Teachers.add(new Teacher(true, "P.E.", "K", false, null, false, true, "Matthew Dence"));
        Teachers.add(new Teacher(true, "P.E.", "AD", false, null, false, true, "Brian Grady"));
        Teachers.add(new Teacher(true, "P.E.", "T", true, "gray", false, false, "David Martin"));
        //Science
        Teachers.add(new Teacher(true, "Science", null, true, "blonde", false, true, "James Anderson"));
        Teachers.add(new Teacher(false, "Science", "G", true, "blonde", false, false, "Elizabeth Cravero"));
        Teachers.add(new Teacher(false, "Science", "AD", true, "brown", true, false, "Julia Downs"));
        Teachers.add(new Teacher(false, "Science", "W", true, "brown", false, false, "Diane Goldstein"));
        Teachers.add(new Teacher(false, "Science", "W", true, "blonde", false, false, "Sarah Kesten"));
        Teachers.add(new Teacher(true, "Science", "R", true, "brown", false, false, "Matthew Kraynak"));
        Teachers.add(new Teacher(true, "Science", "R", true, "gray", false, false, "Victor Montemayor"));
        Teachers.add(new Teacher(false, "Science", "O", true, "blonde", true, false, "Kimberly O'Brien"));
        Teachers.add(new Teacher(true, "Science", "W", true, "gray", false, false, "Richard O'Hern"));
        Teachers.add(new Teacher(false, "Science", "O", true, "gray", true, false, "Rebecca Pizzino"));
        Teachers.add(new Teacher(true, "Science", "T", true, "brown", true, false, "Michael Ream"));
        //Fine Arts
        Teachers.add(new Teacher(false, "Fine Arts", "G", true, "brown", false, false, "Ann Esposito"));
        Teachers.add(new Teacher(true, "Fine Arts", "O", true, "brown", false, false, "Sean Gibbons"));
        Teachers.add(new Teacher(true, "Fine Arts", "K", false, null, true, true, "Jon Timmons"));
        //Best department
        Teachers.add(new Teacher(true, "Comp. Sci.", null, true, "brown", false, false, "Ryan Baber"));
    }

    public int getNextQuestion(){
        return countQ;
    }


    public void removeTeachers(Answer a){
//if this is a string answer    
    if(a.isBoolean == false){
            for (int i=0; i<Teachers.size(); i++){
                String teacherValue = Teachers.get(i).getS(a.getKey());
            if ((teacherValue == null && a.getSval() != null) || (teacherValue != null && !teacherValue.equals(a.getSval()))) {
                    Teachers.remove(i);
                    i--;
                }  
            }
        }
//if this is a boolean answer
        else if (a. isBoolean == true){
             for (int i=0; i<Teachers.size(); i++){
                if(!(Teachers.get(i).getB(a.getKey()) == a.getBval())){
                    Teachers.remove(i);
                    i--;
                }  
            }
        }
        countQ++;
    }

    public int getLength(){
        return Teachers.size();
    }

    public Teacher guessTeacher(){
        return Teachers.get(0);
    }
}
