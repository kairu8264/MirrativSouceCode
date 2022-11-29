package pi;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import hi.id;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class ia extends w5 {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f47955g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f47956h = {"_err"};

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f47957i = 0;

    /* renamed from: c  reason: collision with root package name */
    public SecureRandom f47958c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f47959d;

    /* renamed from: e  reason: collision with root package name */
    public int f47960e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f47961f;

    public ia(b5 b5Var) {
        super(b5Var);
        this.f47961f = null;
        this.f47959d = new AtomicLong(0L);
    }

    public static boolean V(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean W(String str) {
        rh.p.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean X(Context context) {
        ActivityInfo receiverInfo;
        rh.p.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean Y(Context context, boolean z10) {
        rh.p.i(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return i0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return i0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean Z(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean a0(String str) {
        return !f47956h[0].equals(str);
    }

    public static final boolean d0(Bundle bundle, int i10) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i10);
            return true;
        }
        return false;
    }

    public static final boolean e0(String str) {
        rh.p.i(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static boolean h0(String str, String[] strArr) {
        rh.p.i(strArr);
        for (String str2 : strArr) {
            if (Z(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static MessageDigest q() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long q0(byte[] bArr) {
        rh.p.i(bArr);
        int length = bArr.length;
        int i10 = 0;
        rh.p.l(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public static ArrayList<Bundle> t(List<c> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (c cVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString(MRLog.PAYLOAD_KEY_APP_ID, cVar.f47680w);
            bundle.putString(TtmlNode.ATTR_TTS_ORIGIN, cVar.f47681x);
            bundle.putLong("creation_timestamp", cVar.f47683z);
            bundle.putString("name", cVar.f47682y.f47793x);
            y5.b(bundle, rh.p.i(cVar.f47682y.p()));
            bundle.putBoolean("active", cVar.A);
            String str = cVar.B;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            u uVar = cVar.C;
            if (uVar != null) {
                bundle.putString("timed_out_event_name", uVar.f48250w);
                s sVar = uVar.f48251x;
                if (sVar != null) {
                    bundle.putBundle("timed_out_event_params", sVar.S());
                }
            }
            bundle.putLong("trigger_timeout", cVar.D);
            u uVar2 = cVar.E;
            if (uVar2 != null) {
                bundle.putString("triggered_event_name", uVar2.f48250w);
                s sVar2 = uVar2.f48251x;
                if (sVar2 != null) {
                    bundle.putBundle("triggered_event_params", sVar2.S());
                }
            }
            bundle.putLong("triggered_timestamp", cVar.f47682y.f47794y);
            bundle.putLong("time_to_live", cVar.F);
            u uVar3 = cVar.G;
            if (uVar3 != null) {
                bundle.putString("expired_event_name", uVar3.f48250w);
                s sVar3 = uVar3.f48251x;
                if (sVar3 != null) {
                    bundle.putBundle("expired_event_params", sVar3.S());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void w(p7 p7Var, Bundle bundle, boolean z10) {
        if (bundle != null && p7Var != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = p7Var.f48127a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = p7Var.f48128b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", p7Var.f48129c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && p7Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void A(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f48285a.r().w().c("Not putting event parameter. Invalid value type. name, type", this.f48285a.C().e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void B(hi.i1 i1Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(TopicConstant.EXTEND_AAC_RAW, z10);
        try {
            i1Var.g0(bundle);
        } catch (RemoteException e10) {
            this.f48285a.r().v().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void C(hi.i1 i1Var, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(TopicConstant.EXTEND_AAC_RAW, arrayList);
        try {
            i1Var.g0(bundle);
        } catch (RemoteException e10) {
            this.f48285a.r().v().b("Error returning bundle list to wrapper", e10);
        }
    }

    public final void D(hi.i1 i1Var, Bundle bundle) {
        try {
            i1Var.g0(bundle);
        } catch (RemoteException e10) {
            this.f48285a.r().v().b("Error returning bundle value to wrapper", e10);
        }
    }

    public final void E(hi.i1 i1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(TopicConstant.EXTEND_AAC_RAW, bArr);
        try {
            i1Var.g0(bundle);
        } catch (RemoteException e10) {
            this.f48285a.r().v().b("Error returning byte array to wrapper", e10);
        }
    }

    public final void G(hi.i1 i1Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(TopicConstant.EXTEND_AAC_RAW, i10);
        try {
            i1Var.g0(bundle);
        } catch (RemoteException e10) {
            this.f48285a.r().v().b("Error returning int value to wrapper", e10);
        }
    }

    public final void H(hi.i1 i1Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong(TopicConstant.EXTEND_AAC_RAW, j10);
        try {
            i1Var.g0(bundle);
        } catch (RemoteException e10) {
            this.f48285a.r().v().b("Error returning long value to wrapper", e10);
        }
    }

    public final void I(hi.i1 i1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(TopicConstant.EXTEND_AAC_RAW, str);
        try {
            i1Var.g0(bundle);
        } catch (RemoteException e10) {
            this.f48285a.r().v().b("Error returning string value to wrapper", e10);
        }
    }

    public final void J(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int i10;
        String str4;
        int O;
        if (bundle == null) {
            return;
        }
        this.f48285a.y();
        int i11 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int m02 = !z10 ? m0(str5) : 0;
                if (m02 == 0) {
                    m02 = l0(str5);
                }
                i10 = m02;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                v(bundle, i10, str5, str5, i10 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (T(bundle.get(str5))) {
                    this.f48285a.r().w().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    O = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    O = O(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (O != 0 && !"_ev".equals(str4)) {
                    v(bundle, O, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (W(str4) && !h0(str4, a6.f47588d) && (i11 = i11 + 1) > 0) {
                    this.f48285a.r().q().c("Item cannot contain custom parameters", this.f48285a.C().d(str2), this.f48285a.C().b(bundle));
                    d0(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    public final boolean K(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (e0(str)) {
                return true;
            }
            if (this.f48285a.o()) {
                this.f48285a.r().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", q3.y(str));
            }
            return false;
        }
        id.b();
        if (!this.f48285a.y().A(null, c3.f47697e0) || TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(str2)) {
                if (e0(str2)) {
                    return true;
                }
                this.f48285a.r().q().b("Invalid admob_app_id. Analytics disabled.", q3.y(str2));
                return false;
            }
            if (this.f48285a.o()) {
                this.f48285a.r().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        return true;
    }

    public final boolean L(String str, int i10, String str2) {
        if (str2 == null) {
            this.f48285a.r().q().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i10) {
            this.f48285a.r().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        } else {
            return true;
        }
    }

    public final boolean M(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f48285a.r().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        rh.p.i(str2);
        String[] strArr3 = f47955g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f48285a.r().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !h0(str2, strArr)) {
            return true;
        }
        if (strArr2 == null || !h0(str2, strArr2)) {
            this.f48285a.r().q().c("Name is reserved. Type, name", str, str2);
            return false;
        }
        return true;
    }

    public final boolean N(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i10) {
                this.f48285a.r().w().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int O(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.ia.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean P(String str, String str2) {
        if (str2 == null) {
            this.f48285a.r().q().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f48285a.r().q().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    this.f48285a.r().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                codePointAt = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f48285a.r().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean Q(String str, String str2) {
        if (str2 == null) {
            this.f48285a.r().q().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f48285a.r().q().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f48285a.r().q().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f48285a.r().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean R(String str) {
        f();
        if (xh.c.a(this.f48285a.F()).a(str) == 0) {
            return true;
        }
        this.f48285a.r().o().b("Permission not granted", str);
        return false;
    }

    public final boolean S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String t10 = this.f48285a.y().t();
        this.f48285a.b();
        return t10.equals(str);
    }

    public final boolean T(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean U(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f10 = xh.c.a(context).f(str, 64);
            if (f10 == null || (signatureArr = f10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            this.f48285a.r().p().b("Package name not found", e10);
            return true;
        } catch (CertificateException e11) {
            this.f48285a.r().p().b("Error obtaining certificate", e11);
            return true;
        }
    }

    public final boolean b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            rh.p.i(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public final byte[] c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final int f0(String str) {
        if ("_ldl".equals(str)) {
            this.f48285a.y();
            return 2048;
        } else if (!"_id".equals(str)) {
            if (this.f48285a.y().A(null, c3.f47695d0) && "_lgclid".equals(str)) {
                this.f48285a.y();
                return 100;
            }
            this.f48285a.y();
            return 36;
        } else {
            this.f48285a.y();
            return 256;
        }
    }

    @Override // pi.w5
    public final void g() {
        f();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f48285a.r().v().a("Utils falling back to Random for random id");
            }
        }
        this.f47959d.set(nextLong);
    }

    public final Object g0(int i10, Object obj, boolean z10, boolean z11) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if (z11 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (parcelable instanceof Bundle) {
                            Bundle u02 = u0((Bundle) parcelable);
                            if (!u02.isEmpty()) {
                                arrayList.add(u02);
                            }
                        }
                    }
                    return arrayList.toArray(new Bundle[arrayList.size()]);
                }
                return null;
            }
            return o(obj.toString(), i10, z10);
        }
    }

    @Override // pi.w5
    public final boolean h() {
        return true;
    }

    public final int j0(String str, Object obj) {
        boolean N;
        if ("_ldl".equals(str)) {
            N = N("user property referrer", str, f0(str), obj);
        } else {
            N = N("user property", str, f0(str), obj);
        }
        return N ? 0 : 7;
    }

    public final int k0(String str) {
        if (P("event", str)) {
            if (M("event", z5.f48403a, z5.f48404b, str)) {
                this.f48285a.y();
                return !L("event", 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    public final int l0(String str) {
        if (P("event param", str)) {
            if (M("event param", null, null, str)) {
                this.f48285a.y();
                return !L("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final Object m(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.f48285a.y();
            return g0(256, obj, true, true);
        }
        if (V(str)) {
            this.f48285a.y();
        } else {
            this.f48285a.y();
            i10 = 100;
        }
        return g0(i10, obj, false, true);
    }

    public final int m0(String str) {
        if (Q("event param", str)) {
            if (M("event param", null, null, str)) {
                this.f48285a.y();
                return !L("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final Object n(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return g0(f0(str), obj, true, false);
        }
        return g0(f0(str), obj, false, false);
    }

    public final int n0(String str) {
        if (P("user property", str)) {
            if (M("user property", b6.f47645a, null, str)) {
                this.f48285a.y();
                return !L("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    public final String o(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i10) {
            if (z10) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
            }
            return null;
        }
        return str;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int o0() {
        if (this.f47961f == null) {
            this.f47961f = Integer.valueOf(nh.e.f().a(this.f48285a.F()) / 1000);
        }
        return this.f47961f.intValue();
    }

    public final URL p(long j10, String str, String str2, long j11) {
        try {
            rh.p.e(str2);
            rh.p.e(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 46000L, Integer.valueOf(o0())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f48285a.y().u())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            this.f48285a.r().p().b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    public final int p0(int i10) {
        return nh.e.f().h(this.f48285a.F(), nh.g.f43544a);
    }

    public final long r0() {
        long andIncrement;
        long j10;
        if (this.f47959d.get() == 0) {
            synchronized (this.f47959d) {
                long nextLong = new Random(System.nanoTime() ^ this.f48285a.c().currentTimeMillis()).nextLong();
                int i10 = this.f47960e + 1;
                this.f47960e = i10;
                j10 = nextLong + i10;
            }
            return j10;
        }
        synchronized (this.f47959d) {
            this.f47959d.compareAndSet(-1L, 1L);
            andIncrement = this.f47959d.getAndIncrement();
        }
        return andIncrement;
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom s() {
        f();
        if (this.f47958c == null) {
            this.f47958c = new SecureRandom();
        }
        return this.f47958c;
    }

    public final long s0(long j10, long j11) {
        return (j10 + (j11 * DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS)) / 86400000;
    }

    public final Bundle t0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                this.f48285a.r().v().b("Install referrer url isn't a hierarchical URI", e10);
            }
        }
        return null;
    }

    public final void u(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f48285a.r().v().b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final Bundle u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m10 = m(str, bundle.get(str));
                if (m10 == null) {
                    this.f48285a.r().w().b("Param value can't be null", this.f48285a.C().e(str));
                } else {
                    A(bundle2, str, m10);
                }
            }
        }
        return bundle2;
    }

    public final void v(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (d0(bundle, i10)) {
            this.f48285a.y();
            bundle.putString("_ev", o(str, 40, true));
            if (obj != null) {
                rh.p.i(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List<java.lang.String> r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.ia.v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final u w0(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (k0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle v02 = v0(str, str2, bundle3, vh.g.b("_o"), true);
            if (z10) {
                v02 = u0(v02);
            }
            rh.p.i(v02);
            return new u(str2, new s(v02), str3, j10);
        }
        this.f48285a.r().p().b("Invalid conditional property event name", this.f48285a.C().f(str2));
        throw new IllegalArgumentException();
    }

    public final void x(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f48285a.N().A(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void y(r3 r3Var, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(r3Var.f48188d.keySet())) {
            if (W(str) && (i11 = i11 + 1) > i10) {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Event can't contain more than ");
                sb2.append(i10);
                sb2.append(" params");
                this.f48285a.r().q().c(sb2.toString(), this.f48285a.C().d(r3Var.f48185a), this.f48285a.C().b(r3Var.f48188d));
                d0(r3Var.f48188d, 5);
                r3Var.f48188d.remove(str);
            }
        }
    }

    public final void z(ha haVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        d0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        haVar.a(str, "_err", bundle);
    }
}
