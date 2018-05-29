import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * sample of filter collection, feature add in java 8
 * @author r.bernardo.da.silva
 *
 */
public class CollectionFilters {
	
	public static void main(String[] args) {
		
		List<String> countries = Arrays.asList(Locale.getISOCountries());
		
		System.out.println("before > "+countries);
		
		List<String> countriesPrefixB = countries.stream().
									map(s -> String.valueOf(s)).
									filter(country -> country.startsWith("B") ).
									collect(Collectors.toList());
		
		
		System.out.println("after > "+countriesPrefixB);
	}
}
