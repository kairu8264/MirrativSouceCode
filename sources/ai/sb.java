package ai;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class sb {

    /* renamed from: a  reason: collision with root package name */
    public static final int f9778a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f9779b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f9780c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f9781d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f9782e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f9783f;

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f9784g;

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f9785h;

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f9786i;

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f9787j;

    /* renamed from: k  reason: collision with root package name */
    public static HashMap<String, String> f9788k;

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f9789l;

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f9790m;

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f9791n;

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f9792o;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f9778a = i10;
        String str = Build.DEVICE;
        f9779b = str;
        String str2 = Build.MANUFACTURER;
        f9780c = str2;
        String str3 = Build.MODEL;
        f9781d = str3;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(i10);
        f9782e = sb2.toString();
        f9783f = new byte[0];
        f9784g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f9785h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f9786i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f9787j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f9789l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", TtmlNode.ATTR_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f9790m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f9791n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f9792o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, TsExtractor.TS_STREAM_TYPE_AC4, 165, 162, 143, 136, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, TsExtractor.TS_STREAM_TYPE_E_AC3, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, TsExtractor.TS_PACKET_SIZE, 187, 150, 145, 152, 159, TsExtractor.TS_STREAM_TYPE_DTS, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, ListPopupWindow.EXPAND_LIST_TIMEOUT, 253, 244, 243};
    }

    public static byte[] A(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static Point B(Context context) {
        String E;
        DisplayManager displayManager;
        int i10 = f9778a;
        Display display = null;
        if (i10 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && z(context)) {
            if (i10 < 28) {
                E = E("sys.display-size");
            } else {
                E = E("vendor.display-size");
            }
            if (!TextUtils.isEmpty(E)) {
                try {
                    String[] split = E.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String valueOf = String.valueOf(E);
                Log.e("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
            }
            if ("Sony".equals(f9780c) && f9781d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i11 = f9778a;
        if (i11 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        } else if (i11 >= 17) {
            display.getRealSize(point);
            return point;
        } else {
            display.getSize(point);
            return point;
        }
    }

    public static long C(long j10) {
        if (j10 == C.TIME_UNSET) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static String D(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    public static String E(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            oa.b("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e10);
            return null;
        }
    }

    public static HashMap<String, String> F() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f9789l.length;
        HashMap<String, String> hashMap = new HashMap<>(length + 86);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f9789l;
            int length3 = strArr.length;
            if (i10 >= 86) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static boolean G(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean H(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T I(T t10) {
        return t10;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] J(T[] tArr) {
        return tArr;
    }

    public static <T> T[] K(T[] tArr, int i10) {
        u9.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static <T> T[] L(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    public static Handler M(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        u9.e(myLooper);
        return new Handler(myLooper, null);
    }

    public static Handler N(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean O(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    public static Looper P() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static ExecutorService Q(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory("ExoPlayer:Loader:ProgressiveMediaPeriod") { // from class: ai.rb

            /* renamed from: a  reason: collision with root package name */
            public final String f9384a = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.f9384a);
            }
        });
    }

    public static void R(a8 a8Var) {
        try {
            a8Var.g();
        } catch (IOException unused) {
        }
    }

    public static boolean S(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void T(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static String U(Locale locale) {
        return f9778a >= 21 ? locale.toLanguageTag() : locale.toString();
    }

    public static String V(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = replace;
        }
        String a10 = tw2.a(str);
        int i10 = 0;
        String str2 = a10.split("-", 2)[0];
        if (f9788k == null) {
            f9788k = F();
        }
        String str3 = f9788k.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(a10.substring(str2.length()));
            a10 = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            str2 = str3;
        }
        if (!"no".equals(str2) && !TopicConstant.EXTEND_AVC_IDR.equals(str2) && !"zh".equals(str2)) {
            return a10;
        }
        while (true) {
            String[] strArr = f9790m;
            int length = strArr.length;
            if (i10 >= 18) {
                return a10;
            }
            if (a10.startsWith(strArr[i10])) {
                String valueOf2 = String.valueOf(strArr[i10 + 1]);
                String valueOf3 = String.valueOf(a10.substring(strArr[i10].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i10 += 2;
        }
    }

    public static String W(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, zw2.f13232c);
    }

    public static byte[] X(String str) {
        return str.getBytes(zw2.f13232c);
    }

    public static String[] Y(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] Z(String str, String str2) {
        return str.split(str2, 2);
    }

    public static long a(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        if (((j10 ^ j13) & (j11 ^ j13)) < 0) {
            return Long.MAX_VALUE;
        }
        return j13;
    }

    public static String a0(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        if (((j10 ^ j13) & (j11 ^ j10)) < 0) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    public static int b0(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int c(int[] iArr, int i10, boolean z10, boolean z11) {
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i10);
        return binarySearch;
    }

    public static int c0(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int d(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = binarySearch + 1;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static long d0(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static int e(long[] jArr, long j10, boolean z10, boolean z11) {
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j10);
        return !z10 ? binarySearch : binarySearch - 1;
    }

    public static float e0(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static long f(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static long g(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long h(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 < 0 || j12 % j11 != 0) {
            return (i10 >= 0 || j11 % j12 != 0) ? (long) (j10 * (j11 / j12)) : j10 * (j11 / j12);
        }
        return j10 / (j12 / j11);
    }

    public static void i(long[] jArr, long j10, long j11) {
        int i10 = (j11 > 1000000L ? 1 : (j11 == 1000000L ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j11 % 1000000 == 0) {
            long j12 = j11 / 1000000;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] / j12;
                i11++;
            }
        } else if (i10 < 0 && 1000000 % j11 == 0) {
            long j13 = 1000000 / j11;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] * j13;
                i11++;
            }
        } else {
            double d10 = 1000000.0d / j11;
            while (i11 < jArr.length) {
                jArr[i11] = (long) (jArr[i11] * d10);
                i11++;
            }
        }
    }

    public static long j(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static long k(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static long l(int i10, int i11) {
        return (i11 & 4294967295L) | ((i10 & 4294967295L) << 32);
    }

    public static String m(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int length = objArr.length;
            if (i10 >= length) {
                return sb2.toString();
            }
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }

    public static v4 n(int i10, int i11, int i12) {
        t4 t4Var = new t4();
        t4Var.n(MimeTypes.AUDIO_RAW);
        t4Var.B(i11);
        t4Var.C(i12);
        t4Var.D(i10);
        return t4Var.I();
    }

    public static int o(int i10) {
        if (i10 != 8) {
            if (i10 != 16) {
                if (i10 != 24) {
                    if (i10 != 32) {
                        return 0;
                    }
                    return C.ENCODING_PCM_32BIT;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static boolean p(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean q(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static int r(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i11 = f9778a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int s(int i10, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 268435456) {
                        if (i10 == 536870912) {
                            return i11 * 3;
                        }
                        if (i10 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i11 * 4;
            }
            return i11;
        }
        return i11 + i11;
    }

    public static int t(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int u(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 != 10) {
            if (i10 != 7) {
                if (i10 != 8) {
                    switch (i10) {
                        case 15:
                            return 6003;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i10) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }
                return 6003;
            }
            return 6005;
        }
        return 6004;
    }

    public static int v(byte[] bArr, int i10, int i11, int i12) {
        int i13 = -1;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = f9791n[(i13 >>> 24) ^ (bArr[i14] & TagConstant.TAG_CAT_RESERVED)] ^ (i13 << 8);
        }
        return i13;
    }

    public static int w(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            i13 = f9792o[i13 ^ (bArr[i10] & TagConstant.TAG_CAT_RESERVED)];
            i10++;
        }
        return i13;
    }

    public static String x(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return tw2.b(networkCountryIso);
            }
        }
        return tw2.b(Locale.getDefault().getCountry());
    }

    public static String[] y() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = f9778a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{U(configuration.locale)};
        for (int i10 = 0; i10 < split.length; i10++) {
            split[i10] = V(split[i10]);
        }
        return split;
    }

    public static boolean z(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }
}
