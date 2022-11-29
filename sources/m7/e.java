package m7;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public interface e {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f40610a = Charset.forName(C.UTF8_NAME);

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
