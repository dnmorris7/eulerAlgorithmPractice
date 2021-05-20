package videoStore;

public class VideoElement extends DataElement {

	private String videoTitle;
	private String movieStar1;
	private String movieStar2;
	private String movieProducer;
	private String movieDirector;
	private String movieProductionCo;
	private int copiesInStock;

	public VideoElement() {
		videoTitle = "";
		movieStar1 = "";
		movieStar2 = "";
		movieProducer = "";
		movieDirector = "";
		movieProductionCo = "";
		copiesInStock = 0;
	}

	public VideoElement(String videoTitle, String movieStar1, String movieStar2, String movieProducer,
			String movieDirector, String movieProductionCo, int copiesInStock) {
		super();
		this.videoTitle = videoTitle;
		this.movieStar1 = movieStar1;
		this.movieStar2 = movieStar2;
		this.movieProducer = movieProducer;
		this.movieDirector = movieDirector;
		this.movieProductionCo = movieProductionCo;
		this.copiesInStock = copiesInStock;
	}

	public void setVideoInfo(String title, String star1, String star2, String producer, String director,
			String productionCo, int setInStock) {

		videoTitle = title;
		movieStar1 = star1;
		movieStar2 = star2;
		movieProducer = producer;
		movieDirector = director;
		movieProductionCo = productionCo;
		copiesInStock = setInStock;
	}

	public int getStockNumbers() {
		return copiesInStock;
	}

	public void checkIn() {
		copiesInStock++;
	}

	public void checkOut() {
		if (getStockNumbers() > 0)
			copiesInStock--;
		else
			System.out.println("Currently Out of Stock.");

	}

	public boolean checkTitle(String title) {
		return (videoTitle.compareTo(title) == 0);
	}

	public void updateStock(int num) {
		copiesInStock += num;
	}

	public void setCopiesInStock(int num) {
		copiesInStock = num;
	}

	@Override
	public boolean equals(DataElement otherElement) {
		VideoElement temp = (VideoElement) otherElement;

		return (videoTitle.compareTo(temp.videoTitle) == 0);
	}

	@Override
	public int compareTo(DataElement otherElement) {
		VideoElement temp = (VideoElement) otherElement;

		return (videoTitle.compareTo(temp.videoTitle));
	}

	@Override
	public void makeCopy(DataElement otherElement) {
		VideoElement temp = (VideoElement) otherElement;
		videoTitle = temp.videoTitle;
		movieStar1 = temp.movieStar1;
		movieStar2 = temp.movieStar2;
		movieProducer = temp.movieProducer;
		movieDirector = temp.movieDirector;
		movieProductionCo = temp.movieProductionCo;
		copiesInStock = temp.copiesInStock;
	}

	@Override
	public DataElement getCopy() {
		VideoElement temp = new VideoElement(videoTitle, movieStar1, movieStar2, movieProducer, movieDirector,
				movieProductionCo, copiesInStock);
		return temp;
	}

	public void printTitle() {
		System.out.println("Video Title: " + videoTitle);

	}

	@Override
	public String toString() {
		return "VideoElement [videoTitle=" + videoTitle + ", movieStar1=" + movieStar1 + ", movieStar2=" + movieStar2
				+ ", movieProducer=" + movieProducer + ", movieDirector=" + movieDirector + ", movieProductionCo="
				+ movieProductionCo + ", copiesInStock=" + copiesInStock + "]";
	}

}
