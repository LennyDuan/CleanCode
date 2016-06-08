//It is just plain silly to have a rule that says that every function must have a javadoc, or every variable must have a comment.
//
/** *
 * @param title The title of the CD
 * * @param author The author of the CD
 * * @param tracks The number of tracks on the CD
 * * @param durationInMinutes The duration of the CD in minutes 
 * */

public void addCD(String title, String author,
        int tracks, int durationInMinutes) {
    CD cd = new CD(); 
    cd.title = title; 
    cd.author = author; 
    cd.tracks = tracks; 
    cd.duration = duration; 
    cdList.add(cd);
}
