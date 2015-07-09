/**
* Created by taylor on 7/8/2015.
*/

public class SocialAdapter implements SocialMediaEntry {

    YouTubeVideo video;
    
    public SocialAdapter (YouTubeVideo) {
        this.video = video;
    }
    
    public String getUser() {
        return video.getAuthor();
    }
    
    public String getPostText() {
        return video.getTitle() + ", " + video.getDescription();
    }
}
