package data;

import java.io.Serializable;

/*
 * novel meta data? or data structure? for novel of 小説家になろう(https://syosetu.com/)
 */
public class Novel implements Serializable{
	private transient final String url1 = "https://syosetu.com/";
	private transient final String url2 = "https://nocde.syosetu.com/";
	private transient final String seperator = "::";
	private String title;
	private String id;
	private int lastEpisode;
		
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLastEpisode() {
		return lastEpisode;
	}
	public void setLastEpisode(int lastEpisode) {
		this.lastEpisode = lastEpisode;
	}
	public String getURL() {
		return this.url2 + id;
	}
	
	@Override
	public String toString() {
		return getTitle() + seperator +  getId() + seperator + getLastEpisode() + seperator + getURL();
	}
	
}
