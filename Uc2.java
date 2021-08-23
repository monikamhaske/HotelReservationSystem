package HotelReservation;

import java.util.List;
//import java.time.LocalDate;
import java.util.Map;
import java.util.ArrayList;
import java.time.Date;
import java.util.LocalDate;
public class Uc2 {
	private String name;
	private int regularWeekendRate;
	private int rating;
	private int rewardWeekdayRate;
	private int rewardsWeekendRate;

public uc2(String name, int regularWeekendRate, int regularWeekdayRate,int rating,int rewardWeekdayRate,int rewardsWeekendRate)
{
this.name=name;
this.regularWeekendRate=regularWeekendRate;
this.regularWeekdayRate= regularWeekdayRate;
this.rating=rating;
this.rewardWeekdayRate=rewardWeekdayRate;
this.rewardsWeekendRate=rewardsWeekendRate;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int get

	regularWeekdayRate()
 {
	 return regularWeekdayRate;
 }

	public void set

	RegularWekdayRate(int regularWeekdayRate)
 {
	 this.regularWeekdayRate=regularWeekdayRate;
 }

	public int get

	regularWeekendRate()
 {
	 return regularWeekendRate;
 }

	public void set

	RegularWeekendRate(int regularWeekendRate)
 {
	 this.regularWeekendRate=regularWeekendRate;
 }

	public int getRewardsWeekdayRate() {
		return rewardsWeekdayRate;
	}

	public void setRewardsWeekdayRate(int rewardsWeekdayRate) {
		this.rewardsWeekdayRate = rewardsWeekdayRate;
	}

	public int getRewardsWeekendRate() {
		return rewardsWeekendRate;
	}

	public void setRewardsWeekendRate(int rewardsWeekendRate) {
		this.rewardsWeekendRate = rewardsWeekendRate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
private List<hotel> hotels;

public Uc2()
{
	 this.hotels=new ArrayList<Hotel>();
}

	public void add(Hotel hotel) {
		hotels.add(hotel);
	}

public List<Hotel> getHotelList()
{
	 return this.hotels;
}

	

	}

	private List<hotel> hotels;

public Uc3()
{
	 this.hotels=new ArrayList<Hotel>();
}

	public void add(Hotel hotel) {
		hotels.add(hotel);
	}

public List<Hotel> getHotelList()
{
	 return this.hotels;

	public Map<Hotel, Integer> searchFor(String date1, String date2, String hotelType, )
		{
			int totalDays = countTotalDays(date1, date2);
			int weekDays = countWeekDays(date1, date2);
			int weekendDays = totalDays - weekDays;
			if (hotelType.equals("cheapest"))
				return searchForCheapestHotels(weekDays, weekendDays, );
			
			else
				return null;
		}
	
	
	public int countTotalDays(String date1, String date2)
	{
		LocalDate startDate = toLocalDate(date1);
		LocalDate endDate = toLocalDate(date2);
		int totalDays = Period.between(startDate, endDate).getDays() + 1;
		return totalDays;
	}
}
