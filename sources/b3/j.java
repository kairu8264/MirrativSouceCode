package b3;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class j {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f16804a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f16805b;

        /* renamed from: c  reason: collision with root package name */
        public final o[] f16806c;

        /* renamed from: d  reason: collision with root package name */
        public final o[] f16807d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f16808e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16809f;

        /* renamed from: g  reason: collision with root package name */
        public final int f16810g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f16811h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f16812i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f16813j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f16814k;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.f(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f16814k;
        }

        public boolean b() {
            return this.f16808e;
        }

        public o[] c() {
            return this.f16807d;
        }

        public Bundle d() {
            return this.f16804a;
        }

        @Deprecated
        public int e() {
            return this.f16812i;
        }

        public IconCompat f() {
            int i10;
            if (this.f16805b == null && (i10 = this.f16812i) != 0) {
                this.f16805b = IconCompat.f(null, "", i10);
            }
            return this.f16805b;
        }

        public o[] g() {
            return this.f16806c;
        }

        public int h() {
            return this.f16810g;
        }

        public boolean i() {
            return this.f16809f;
        }

        public CharSequence j() {
            return this.f16813j;
        }

        public boolean k() {
            return this.f16811h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o[] oVarArr, o[] oVarArr2, boolean z10, int i10, boolean z11, boolean z12) {
            this.f16809f = true;
            this.f16805b = iconCompat;
            if (iconCompat != null && iconCompat.m() == 2) {
                this.f16812i = iconCompat.h();
            }
            this.f16813j = e.h(charSequence);
            this.f16814k = pendingIntent;
            this.f16804a = bundle == null ? new Bundle() : bundle;
            this.f16806c = oVarArr;
            this.f16807d = oVarArr2;
            this.f16808e = z10;
            this.f16810g = i10;
            this.f16809f = z11;
            this.f16811h = z12;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: e  reason: collision with root package name */
        public Bitmap f16815e;

        /* renamed from: f  reason: collision with root package name */
        public IconCompat f16816f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f16817g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f16818h;

        /* loaded from: classes.dex */
        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: b3.j$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0097b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* loaded from: classes.dex */
        public static class c {
            public static void a(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // b3.j.f
        public void b(i iVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(iVar.a()).setBigContentTitle(this.f16847b).bigPicture(this.f16815e);
                if (this.f16817g) {
                    IconCompat iconCompat = this.f16816f;
                    if (iconCompat == null) {
                        a.a(bigPicture, null);
                    } else if (i10 >= 23) {
                        C0097b.a(bigPicture, this.f16816f.w(iVar instanceof k ? ((k) iVar).f() : null));
                    } else if (iconCompat.m() == 1) {
                        a.a(bigPicture, this.f16816f.g());
                    } else {
                        a.a(bigPicture, null);
                    }
                }
                if (this.f16849d) {
                    a.b(bigPicture, this.f16848c);
                }
                if (i10 >= 31) {
                    c.a(bigPicture, this.f16818h);
                }
            }
        }

        @Override // b3.j.f
        public String h() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b m(Bitmap bitmap) {
            this.f16816f = bitmap == null ? null : IconCompat.d(bitmap);
            this.f16817g = true;
            return this;
        }

        public b n(Bitmap bitmap) {
            this.f16815e = bitmap;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f16819e;

        @Override // b3.j.f
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f16819e);
            }
        }

        @Override // b3.j.f
        public void b(i iVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.f16847b).bigText(this.f16819e);
                if (this.f16849d) {
                    bigText.setSummaryText(this.f16848c);
                }
            }
        }

        @Override // b3.j.f
        public String h() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c m(CharSequence charSequence) {
            this.f16819e = e.h(charSequence);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public e f16846a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f16847b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f16848c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f16849d = false;

        public void a(Bundle bundle) {
            if (this.f16849d) {
                bundle.putCharSequence("android.summaryText", this.f16848c);
            }
            CharSequence charSequence = this.f16847b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String h10 = h();
            if (h10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", h10);
            }
        }

        public abstract void b(i iVar);

        /* JADX WARN: Removed duplicated region for block: B:62:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0189 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01f5  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0205  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews c(boolean r17, int r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 522
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: b3.j.f.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public Bitmap d(int i10, int i11) {
            return e(i10, i11, 0);
        }

        public final Bitmap e(int i10, int i11, int i12) {
            return f(IconCompat.e(this.f16846a.f16820a, i10), i11, i12);
        }

        public final Bitmap f(IconCompat iconCompat, int i10, int i11) {
            Drawable r10 = iconCompat.r(this.f16846a.f16820a);
            int intrinsicWidth = i11 == 0 ? r10.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = r10.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            r10.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                r10.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            r10.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        public final Bitmap g(int i10, int i11, int i12, int i13) {
            int i14 = a3.c.f380c;
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap e10 = e(i14, i13, i11);
            Canvas canvas = new Canvas(e10);
            Drawable mutate = this.f16846a.f16820a.getResources().getDrawable(i10).mutate();
            mutate.setFilterBitmap(true);
            int i15 = (i11 - i12) / 2;
            int i16 = i12 + i15;
            mutate.setBounds(i15, i15, i16, i16);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return e10;
        }

        public String h() {
            return null;
        }

        public RemoteViews i(i iVar) {
            return null;
        }

        public RemoteViews j(i iVar) {
            return null;
        }

        public RemoteViews k(i iVar) {
            return null;
        }

        public void l(e eVar) {
            if (this.f16846a != eVar) {
                this.f16846a = eVar;
                if (eVar != null) {
                    eVar.F(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            return notification.extras;
        }
        if (i10 >= 16) {
            return l.c(notification);
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static class e {
        public boolean A;
        public boolean B;
        public boolean C;
        public String D;
        public Bundle E;
        public int F;
        public int G;
        public Notification H;
        public RemoteViews I;
        public RemoteViews J;
        public RemoteViews K;
        public String L;
        public int M;
        public String N;
        public long O;
        public int P;
        public int Q;
        public boolean R;
        public d S;
        public Notification T;
        public boolean U;
        public Icon V;
        @Deprecated
        public ArrayList<String> W;

        /* renamed from: a  reason: collision with root package name */
        public Context f16820a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f16821b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<n> f16822c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<a> f16823d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f16824e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f16825f;

        /* renamed from: g  reason: collision with root package name */
        public PendingIntent f16826g;

        /* renamed from: h  reason: collision with root package name */
        public PendingIntent f16827h;

        /* renamed from: i  reason: collision with root package name */
        public RemoteViews f16828i;

        /* renamed from: j  reason: collision with root package name */
        public Bitmap f16829j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f16830k;

        /* renamed from: l  reason: collision with root package name */
        public int f16831l;

        /* renamed from: m  reason: collision with root package name */
        public int f16832m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f16833n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f16834o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f16835p;

        /* renamed from: q  reason: collision with root package name */
        public f f16836q;

        /* renamed from: r  reason: collision with root package name */
        public CharSequence f16837r;

        /* renamed from: s  reason: collision with root package name */
        public CharSequence f16838s;

        /* renamed from: t  reason: collision with root package name */
        public CharSequence[] f16839t;

        /* renamed from: u  reason: collision with root package name */
        public int f16840u;

        /* renamed from: v  reason: collision with root package name */
        public int f16841v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f16842w;

        /* renamed from: x  reason: collision with root package name */
        public String f16843x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f16844y;

        /* renamed from: z  reason: collision with root package name */
        public String f16845z;

        public e(Context context, String str) {
            this.f16821b = new ArrayList<>();
            this.f16822c = new ArrayList<>();
            this.f16823d = new ArrayList<>();
            this.f16833n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f16820a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f16832m = 0;
            this.W = new ArrayList<>();
            this.R = true;
        }

        public static CharSequence h(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(int i10) {
            this.f16832m = i10;
            return this;
        }

        public e B(int i10, int i11, boolean z10) {
            this.f16840u = i10;
            this.f16841v = i11;
            this.f16842w = z10;
            return this;
        }

        public e C(boolean z10) {
            this.f16833n = z10;
            return this;
        }

        public e D(int i10) {
            this.T.icon = i10;
            return this;
        }

        public e E(Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e F(f fVar) {
            if (this.f16836q != fVar) {
                this.f16836q = fVar;
                if (fVar != null) {
                    fVar.l(this);
                }
            }
            return this;
        }

        public e G(CharSequence charSequence) {
            this.f16837r = h(charSequence);
            return this;
        }

        public e H(CharSequence charSequence) {
            this.T.tickerText = h(charSequence);
            return this;
        }

        public e I(boolean z10) {
            this.f16834o = z10;
            return this;
        }

        public e J(long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }

        public e K(int i10) {
            this.G = i10;
            return this;
        }

        public e L(long j10) {
            this.T.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f16821b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f16821b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new k(this).c();
        }

        public int d() {
            return this.F;
        }

        public Bundle e() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public int f() {
            return this.f16832m;
        }

        public long g() {
            if (this.f16833n) {
                return this.T.when;
            }
            return 0L;
        }

        public final Bitmap i(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f16820a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a3.b.f371b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a3.b.f370a);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        public e j(boolean z10) {
            u(16, z10);
            return this;
        }

        public e k(int i10) {
            this.M = i10;
            return this;
        }

        public e l(String str) {
            this.L = str;
            return this;
        }

        public e m(int i10) {
            this.F = i10;
            return this;
        }

        public e n(boolean z10) {
            this.B = z10;
            this.C = true;
            return this;
        }

        public e o(RemoteViews remoteViews) {
            this.T.contentView = remoteViews;
            return this;
        }

        public e p(PendingIntent pendingIntent) {
            this.f16826g = pendingIntent;
            return this;
        }

        public e q(CharSequence charSequence) {
            this.f16825f = h(charSequence);
            return this;
        }

        public e r(CharSequence charSequence) {
            this.f16824e = h(charSequence);
            return this;
        }

        public e s(int i10) {
            Notification notification = this.T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e t(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public final void u(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.T;
                notification.flags = i10 | notification.flags;
                return;
            }
            Notification notification2 = this.T;
            notification2.flags = (~i10) & notification2.flags;
        }

        public e v(Bitmap bitmap) {
            this.f16829j = i(bitmap);
            return this;
        }

        public e w(int i10, int i11, int i12) {
            Notification notification = this.T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e x(boolean z10) {
            this.A = z10;
            return this;
        }

        public e y(int i10) {
            this.f16831l = i10;
            return this;
        }

        public e z(boolean z10) {
            u(2, z10);
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
