import com.bocek.api.Converter;

public class AddressConverter implements Converter<String , AddressDto> {
    @Override
    public AddressDto convert(String input) {
        AddressDto addressDto = new AddressDto();
        String[] a = input.split(",");
        addressDto.setId(Long.parseLong(a[0]));
        addressDto.setFirstName(a[1]);
        addressDto.setLastName(a[2]);
        addressDto.setLanguage(a[3]);
        return addressDto;
    }

}
