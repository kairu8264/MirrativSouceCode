package ai;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f10526a = "0123456789abcdef".toCharArray();

    public static String a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return i74.a(bArr, true);
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & TagConstant.TAG_CAT_RESERVED;
            int i12 = i10 + i10;
            char[] cArr2 = f10526a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static byte[] c(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            for (int i10 = 0; i10 < length; i10 += 2) {
                bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
            }
            return bArr;
        }
        throw new IllegalArgumentException("String must be of even-length");
    }

    public static String d(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        ug3.c(th2, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean e(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean f() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean g(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static long h(double d10, int i10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / displayMetrics.density);
    }

    public static Activity i(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        for (int i10 = 0; (context instanceof ContextWrapper) && i10 < 10; i10++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
