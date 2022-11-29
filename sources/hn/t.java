package hn;

import com.google.android.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    public static final SecureRandom f36273a = new SecureRandom();

    public static String a(URI uri) {
        String host = uri.getHost();
        if (host != null) {
            return host;
        }
        String b10 = b(uri.getRawAuthority());
        return b10 != null ? b10 : c(uri.toString());
    }

    public static String b(String str) {
        Matcher matcher;
        if (str == null || (matcher = Pattern.compile("^(.*@)?([^:]+)(:\\d+)?$").matcher(str)) == null || !matcher.matches()) {
            return null;
        }
        return matcher.group(2);
    }

    public static String c(String str) {
        Matcher matcher;
        if (str == null || (matcher = Pattern.compile("^\\w+://([^@/]*@)?([^:/]+)(:\\d+)?(/.*)?$").matcher(str)) == null || !matcher.matches()) {
            return null;
        }
        return matcher.group(2);
    }

    public static byte[] d(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(C.UTF8_NAME);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static Constructor<?> e(String str, Class<?>[] clsArr) {
        try {
            return Class.forName(str).getConstructor(clsArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Method f(String str, String str2, Class<?>[] clsArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object g(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String h(Collection<?> collection, String str) {
        StringBuilder sb2 = new StringBuilder();
        i(sb2, collection, str);
        return sb2.toString();
    }

    public static void i(StringBuilder sb2, Collection<?> collection, String str) {
        boolean z10 = true;
        for (Object obj : collection) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(str);
            }
            sb2.append(obj.toString());
        }
    }

    public static int j(int[] iArr) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (i10 < iArr[i11]) {
                i10 = iArr[i11];
            }
        }
        return i10;
    }

    public static int k(int[] iArr) {
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] < i10) {
                i10 = iArr[i11];
            }
        }
        return i10;
    }

    public static Object l(Constructor<?> constructor, Object... objArr) {
        if (constructor == null) {
            return null;
        }
        try {
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] m(int i10) {
        return n(new byte[i10]);
    }

    public static byte[] n(byte[] bArr) {
        f36273a.nextBytes(bArr);
        return bArr;
    }

    public static String o(InputStream inputStream, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                if (read == 10) {
                    break;
                } else if (read != 13) {
                    byteArrayOutputStream.write(read);
                } else {
                    int read2 = inputStream.read();
                    if (read2 == -1) {
                        byteArrayOutputStream.write(read);
                        break;
                    } else if (read2 == 10) {
                        break;
                    } else {
                        byteArrayOutputStream.write(read);
                        byteArrayOutputStream.write(read2);
                    }
                }
            } else if (byteArrayOutputStream.size() == 0) {
                return null;
            }
        }
        return byteArrayOutputStream.toString(str);
    }

    public static String p(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    switch (i10) {
                        case 8:
                            return "CLOSE";
                        case 9:
                            return "PING";
                        case 10:
                            return "PONG";
                        default:
                            return (1 > i10 || i10 > 7) ? (8 > i10 || i10 > 15) ? String.format("0x%X", Integer.valueOf(i10)) : String.format("CONTROL(0x%X)", Integer.valueOf(i10)) : String.format("DATA(0x%X)", Integer.valueOf(i10));
                    }
                }
                return "BINARY";
            }
            return "TEXT";
        }
        return "CONTINUATION";
    }

    public static String q(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return r(bArr, 0, bArr.length);
    }

    public static String r(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, i10, i11, C.UTF8_NAME);
        } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
