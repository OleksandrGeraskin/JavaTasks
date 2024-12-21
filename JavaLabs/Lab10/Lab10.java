package JavaLabs.Lab10;

import java.util.*;

// Клас Відео
class Video
{
    private String title;
    private String url;
    private int views;
    private int likes;
    private int dislikes;
    private List<Comment> comments;

    public Video(String title, String url, int views, int likes, int dislikes, List<Comment> comments)
    {
        this.title = title;
        this.url = url;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = comments;
    }

    public int getViews()
    {
        return views;
    }

    public int getDislikes()
    {
        return dislikes;
    }

    public List<Comment> getComments()
    {
        return comments;
    }

    public int getLikes()
    {
        return likes;
    }

    @Override
    public String toString()
    {
        return "Video{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", dislikes=" + dislikes +
                '}';
    }
}

// Клас Коментар
class Comment
{
    private String text;
    private int likes;
    private int dislikes;

    public Comment(String text, int likes, int dislikes)
    {
        this.text = text;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public int getLikes()
    {
        return likes;
    }

    @Override
    public String toString()
    {
        return "Comment{" +
                "text='" + text + '\'' +
                ", likes=" + likes +
                '}';
    }
}

// Клас Відеоблог
class VideoBlog
{
    private String blogger;
    private List<Video> videos;

    public VideoBlog(String blogger, List<Video> videos)
    {
        this.blogger = blogger;
        this.videos = videos;
    }

    // 1) Загальна кількість переглядів
    public int getTotalViews()
    {
        int totalViews = 0;
        for (Video video : videos) {
            totalViews += video.getViews();
        }
        return totalViews;
    }

    // 2) Перевірка коментарів
    public boolean hasCommentWithMoreLikesThanVideo()
    {
        for (Video video : videos) {
            for (Comment comment : video.getComments())
            {
                if (comment.getLikes() > video.getLikes())
                {
                    return true;
                }
            }
        }
        return false;
    }

    // 3) Відео з найбільшою кількістю дізлайків
    public List<Video> getMostDislikedVideos()
    {
        List<Video> result = new ArrayList<>();
        int maxDislikes = 0;
        Iterator<Video> iterator = videos.iterator(); // нетипізований ітератор

        while (iterator.hasNext())
        {
            Video video = iterator.next();
            if (video.getDislikes() > maxDislikes)
            {
                maxDislikes = video.getDislikes();
                result.clear();
                result.add(video);
            }
            else if (video.getDislikes() == maxDislikes)
            {
                result.add(video);
            }
        }
        return result;
    }
}

public class Lab10
{
    public static void main(String[] args)
    {
        // Приклади коментарів
        Comment comment1 = new Comment("Відео супер!", 50, 5);
        Comment comment2 = new Comment("Не дуже", 10, 15);
        Comment comment3 = new Comment("Класно", 100, 3);

        // Приклади відео
        Video video1 = new Video("Video 1", "http://video1.com", 1000, 60, 10, Arrays.asList(comment1, comment2));
        Video video2 = new Video("Video 2", "http://video2.com", 2000, 70, 20, Arrays.asList(comment3));
        Video video3 = new Video("Video 3", "http://video3.com", 1500, 50, 20, new ArrayList<>());

        // Відеоблог
        VideoBlog blog = new VideoBlog("Alex", Arrays.asList(video1, video2, video3));

        // Виклик методів
        System.out.println("Загальна кількість переглядів: " + blog.getTotalViews());
        System.out.println("Має коментар більш залайканий ніж відео: " + blog.hasCommentWithMoreLikesThanVideo());
        System.out.println("Відео з більшою кількістю дізлайків: " + blog.getMostDislikedVideos());
    }
}
