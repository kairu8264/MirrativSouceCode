package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.exoplayer2.C;
import e3.h;
import g3.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f14963k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f14964a;

    /* renamed from: b  reason: collision with root package name */
    public Object f14965b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f14966c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f14967d;

    /* renamed from: e  reason: collision with root package name */
    public int f14968e;

    /* renamed from: f  reason: collision with root package name */
    public int f14969f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f14970g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f14971h;

    /* renamed from: i  reason: collision with root package name */
    public String f14972i;

    /* renamed from: j  reason: collision with root package name */
    public String f14973j;

    public IconCompat() {
        this.f14964a = -1;
        this.f14966c = null;
        this.f14967d = null;
        this.f14968e = 0;
        this.f14969f = 0;
        this.f14970g = null;
        this.f14971h = f14963k;
        this.f14972i = null;
    }

    public static Bitmap c(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat d(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f14965b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat e(Context context, int i10) {
        if (context != null) {
            return f(context.getResources(), context.getPackageName(), i10);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static IconCompat f(Resources resources, String str, int i10) {
        if (str != null) {
            if (i10 != 0) {
                IconCompat iconCompat = new IconCompat(2);
                iconCompat.f14968e = i10;
                if (resources != null) {
                    try {
                        iconCompat.f14965b = resources.getResourceName(i10);
                    } catch (Resources.NotFoundException unused) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                } else {
                    iconCompat.f14965b = str;
                }
                iconCompat.f14973j = str;
                return iconCompat;
            }
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    public static int i(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public static String k(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        }
    }

    public static Resources l(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e10);
            return null;
        }
    }

    public static int n(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e12);
            return -1;
        }
    }

    public static Uri p(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public static String x(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public void b(Context context) {
        Object obj;
        if (this.f14964a != 2 || (obj = this.f14965b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String j10 = j();
            int identifier = l(context, j10).getIdentifier(str4, str3, str5);
            if (this.f14968e != identifier) {
                Log.i("IconCompat", "Id has changed for " + j10 + " " + str);
                this.f14968e = identifier;
            }
        }
    }

    public Bitmap g() {
        int i10 = this.f14964a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f14965b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f14965b;
        } else {
            if (i10 == 5) {
                return c((Bitmap) this.f14965b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int h() {
        int i10 = this.f14964a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 == 2) {
                return this.f14968e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return i((Icon) this.f14965b);
    }

    public String j() {
        int i10 = this.f14964a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 == 2) {
                if (TextUtils.isEmpty(this.f14973j)) {
                    return ((String) this.f14965b).split(":", -1)[0];
                }
                return this.f14973j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return k((Icon) this.f14965b);
    }

    public int m() {
        int i10 = this.f14964a;
        return (i10 != -1 || Build.VERSION.SDK_INT < 23) ? i10 : n((Icon) this.f14965b);
    }

    public Uri o() {
        int i10 = this.f14964a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 != 4 && i10 != 6) {
                throw new IllegalStateException("called getUri() on " + this);
            }
            return Uri.parse((String) this.f14965b);
        }
        return p((Icon) this.f14965b);
    }

    public InputStream q(Context context) {
        Uri o10 = o();
        String scheme = o10.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f14965b));
            } catch (FileNotFoundException e10) {
                Log.w("IconCompat", "Unable to load image from path: " + o10, e10);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(o10);
        } catch (Exception e11) {
            Log.w("IconCompat", "Unable to load image from URI: " + o10, e11);
            return null;
        }
    }

    public Drawable r(Context context) {
        b(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return w(context).loadDrawable(context);
        }
        Drawable s10 = s(context);
        if (s10 != null && (this.f14970g != null || this.f14971h != f14963k)) {
            s10.mutate();
            a.o(s10, this.f14970g);
            a.p(s10, this.f14971h);
        }
        return s10;
    }

    public final Drawable s(Context context) {
        switch (this.f14964a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f14965b);
            case 2:
                String j10 = j();
                if (TextUtils.isEmpty(j10)) {
                    j10 = context.getPackageName();
                }
                try {
                    return h.f(l(context, j10), this.f14968e, context.getTheme());
                } catch (RuntimeException e10) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f14968e), this.f14965b), e10);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f14965b, this.f14968e, this.f14969f));
            case 4:
                InputStream q10 = q(context);
                if (q10 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(q10));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), c((Bitmap) this.f14965b, false));
            case 6:
                InputStream q11 = q(context);
                if (q11 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(q11)));
                    }
                    return new BitmapDrawable(context.getResources(), c(BitmapFactory.decodeStream(q11), false));
                }
                break;
        }
        return null;
    }

    public void t() {
        this.f14971h = PorterDuff.Mode.valueOf(this.f14972i);
        switch (this.f14964a) {
            case -1:
                Parcelable parcelable = this.f14967d;
                if (parcelable != null) {
                    this.f14965b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f14967d;
                if (parcelable2 != null) {
                    this.f14965b = parcelable2;
                    return;
                }
                byte[] bArr = this.f14966c;
                this.f14965b = bArr;
                this.f14964a = 3;
                this.f14968e = 0;
                this.f14969f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f14966c, Charset.forName(C.UTF16_NAME));
                this.f14965b = str;
                if (this.f14964a == 2 && this.f14973j == null) {
                    this.f14973j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f14965b = this.f14966c;
                return;
        }
    }

    public String toString() {
        if (this.f14964a == -1) {
            return String.valueOf(this.f14965b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(x(this.f14964a));
        switch (this.f14964a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f14965b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f14965b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f14973j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(h())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f14968e);
                if (this.f14969f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f14969f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f14965b);
                break;
        }
        if (this.f14970g != null) {
            sb2.append(" tint=");
            sb2.append(this.f14970g);
        }
        if (this.f14971h != f14963k) {
            sb2.append(" mode=");
            sb2.append(this.f14971h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f14972i = this.f14971h.name();
        switch (this.f14964a) {
            case -1:
                if (!z10) {
                    this.f14967d = (Parcelable) this.f14965b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f14965b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f14966c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f14967d = (Parcelable) this.f14965b;
                return;
            case 2:
                this.f14966c = ((String) this.f14965b).getBytes(Charset.forName(C.UTF16_NAME));
                return;
            case 3:
                this.f14966c = (byte[]) this.f14965b;
                return;
            case 4:
            case 6:
                this.f14966c = this.f14965b.toString().getBytes(Charset.forName(C.UTF16_NAME));
                return;
        }
    }

    @Deprecated
    public Icon v() {
        return w(null);
    }

    public Icon w(Context context) {
        Icon createWithBitmap;
        switch (this.f14964a) {
            case -1:
                return (Icon) this.f14965b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f14965b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(j(), this.f14968e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f14965b, this.f14968e, this.f14969f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f14965b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f14965b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(c((Bitmap) this.f14965b, false));
                    break;
                }
            case 6:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(o());
                    break;
                } else if (context != null) {
                    InputStream q10 = q(context);
                    if (q10 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + o());
                    } else if (i10 >= 26) {
                        createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(q10));
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(c(BitmapFactory.decodeStream(q10), false));
                        break;
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + o());
                }
        }
        ColorStateList colorStateList = this.f14970g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f14971h;
        if (mode != f14963k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public IconCompat(int i10) {
        this.f14964a = -1;
        this.f14966c = null;
        this.f14967d = null;
        this.f14968e = 0;
        this.f14969f = 0;
        this.f14970g = null;
        this.f14971h = f14963k;
        this.f14972i = null;
        this.f14964a = i10;
    }
}
