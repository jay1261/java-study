package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview review1 = new MovieReview();
        review1.title = "반지의제왕";
        review1.review = "재밌음";
        movieReviews[0] = review1;

        MovieReview review2 = new MovieReview();
        review2.title = "인셉션";
        review2.review = "인생은 무한 루프";
        movieReviews[1] = review2;

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println("영화: " + movieReviews[i].title + ", 리뷰: " + movieReviews[i].review);
        }
    }
}
