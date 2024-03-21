package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        review1.title = "반지의제왕";
        review1.review = "재밌음";

        System.out.println("영화: " + review1.title + ", 리뷰: " + review1.review);
    }
}
