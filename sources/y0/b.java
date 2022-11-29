package y0;

import java.util.HashMap;
import jo.p;
import wn.q;
import xn.n0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<j, String> f61035a = n0.g(q.a(j.EmailAddress, "emailAddress"), q.a(j.Username, "username"), q.a(j.Password, "password"), q.a(j.NewUsername, "newUsername"), q.a(j.NewPassword, "newPassword"), q.a(j.PostalAddress, "postalAddress"), q.a(j.PostalCode, "postalCode"), q.a(j.CreditCardNumber, "creditCardNumber"), q.a(j.CreditCardSecurityCode, "creditCardSecurityCode"), q.a(j.CreditCardExpirationDate, "creditCardExpirationDate"), q.a(j.CreditCardExpirationMonth, "creditCardExpirationMonth"), q.a(j.CreditCardExpirationYear, "creditCardExpirationYear"), q.a(j.CreditCardExpirationDay, "creditCardExpirationDay"), q.a(j.AddressCountry, "addressCountry"), q.a(j.AddressRegion, "addressRegion"), q.a(j.AddressLocality, "addressLocality"), q.a(j.AddressStreet, "streetAddress"), q.a(j.AddressAuxiliaryDetails, "extendedAddress"), q.a(j.PostalCodeExtended, "extendedPostalCode"), q.a(j.PersonFullName, "personName"), q.a(j.PersonFirstName, "personGivenName"), q.a(j.PersonLastName, "personFamilyName"), q.a(j.PersonMiddleName, "personMiddleName"), q.a(j.PersonMiddleInitial, "personMiddleInitial"), q.a(j.PersonNamePrefix, "personNamePrefix"), q.a(j.PersonNameSuffix, "personNameSuffix"), q.a(j.PhoneNumber, "phoneNumber"), q.a(j.PhoneNumberDevice, "phoneNumberDevice"), q.a(j.PhoneCountryCode, "phoneCountryCode"), q.a(j.PhoneNumberNational, "phoneNational"), q.a(j.Gender, "gender"), q.a(j.BirthDateFull, "birthDateFull"), q.a(j.BirthDateDay, "birthDateDay"), q.a(j.BirthDateMonth, "birthDateMonth"), q.a(j.BirthDateYear, "birthDateYear"), q.a(j.SmsOtpCode, "smsOTPCode"));

    public static final String a(j jVar) {
        p.h(jVar, "<this>");
        String str = f61035a.get(jVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }
}
