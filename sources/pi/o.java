package pi;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class o extends w5 {

    /* renamed from: c  reason: collision with root package name */
    public long f48084c;

    /* renamed from: d  reason: collision with root package name */
    public String f48085d;

    /* renamed from: e  reason: collision with root package name */
    public AccountManager f48086e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f48087f;

    /* renamed from: g  reason: collision with root package name */
    public long f48088g;

    public o(b5 b5Var) {
        super(b5Var);
    }

    @Override // pi.w5
    public final boolean h() {
        Calendar calendar = Calendar.getInstance();
        this.f48084c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f48085d = sb2.toString();
        return false;
    }

    public final long m() {
        f();
        return this.f48088g;
    }

    public final long n() {
        i();
        return this.f48084c;
    }

    public final String o() {
        i();
        return this.f48085d;
    }

    public final void p() {
        f();
        this.f48087f = null;
        this.f48088g = 0L;
    }

    public final boolean q() {
        Account[] result;
        f();
        long currentTimeMillis = this.f48285a.c().currentTimeMillis();
        if (currentTimeMillis - this.f48088g > 86400000) {
            this.f48087f = null;
        }
        Boolean bool = this.f48087f;
        if (bool == null) {
            if (c3.a.a(this.f48285a.F(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f48285a.r().x().a("Permission error checking for dasher/unicorn accounts");
                this.f48088g = currentTimeMillis;
                this.f48087f = Boolean.FALSE;
                return false;
            }
            if (this.f48086e == null) {
                this.f48086e = AccountManager.get(this.f48285a.F());
            }
            try {
                result = this.f48086e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                this.f48285a.r().s().b("Exception checking account types", e10);
            }
            if (result != null && result.length > 0) {
                this.f48087f = Boolean.TRUE;
                this.f48088g = currentTimeMillis;
                return true;
            }
            Account[] result2 = this.f48086e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f48087f = Boolean.TRUE;
                this.f48088g = currentTimeMillis;
                return true;
            }
            this.f48088g = currentTimeMillis;
            this.f48087f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
