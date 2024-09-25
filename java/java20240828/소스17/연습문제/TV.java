package 연습문제;

public class TV {
	private String model;
	private int size;
	private int channel;
	
	public String getModel() {
		return model;
	}

	public int getSize() {
		return size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public TV() {}
	
	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	
	public void channelUP() {
		int s = this.channel + 1;
		if (s > 10)
			s = 1;
		this.channel = s;
	}
	
	public void channelDown() {
		int s = this.channel-1;
		if (s < 1)
			s = 10;
		this.channel = s;
	}

}
