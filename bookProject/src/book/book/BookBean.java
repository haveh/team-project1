package book.book;

public class BookBean {
	private String no, title, description, pubDate, coverSmallUrl, coverLargeUrl, publisher, author, translator;

	public String getCoverSmallUrl() {
		return coverSmallUrl;
	}

	public void setCoverSmallUrl(String coverSmallUrl) {
		this.coverSmallUrl = coverSmallUrl;
	}

	public String getCoverLargeUrl() {
		return coverLargeUrl;
	}

	public void setCoverLargeUrl(String coverLargeUrl) {
		this.coverLargeUrl = coverLargeUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}
}