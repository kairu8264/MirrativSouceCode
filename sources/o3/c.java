package o3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final f f43880a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final InterfaceC0650c f43881a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f43881a = new b(clipData, i10);
            } else {
                this.f43881a = new d(clipData, i10);
            }
        }

        public c a() {
            return this.f43881a.a();
        }

        public a b(Bundle bundle) {
            this.f43881a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f43881a.setFlags(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f43881a.b(uri);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements InterfaceC0650c {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f43882a;

        public b(ClipData clipData, int i10) {
            this.f43882a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // o3.c.InterfaceC0650c
        public c a() {
            return new c(new e(this.f43882a.build()));
        }

        @Override // o3.c.InterfaceC0650c
        public void b(Uri uri) {
            this.f43882a.setLinkUri(uri);
        }

        @Override // o3.c.InterfaceC0650c
        public void setExtras(Bundle bundle) {
            this.f43882a.setExtras(bundle);
        }

        @Override // o3.c.InterfaceC0650c
        public void setFlags(int i10) {
            this.f43882a.setFlags(i10);
        }
    }

    /* renamed from: o3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0650c {
        c a();

        void b(Uri uri);

        void setExtras(Bundle bundle);

        void setFlags(int i10);
    }

    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0650c {

        /* renamed from: a  reason: collision with root package name */
        public ClipData f43883a;

        /* renamed from: b  reason: collision with root package name */
        public int f43884b;

        /* renamed from: c  reason: collision with root package name */
        public int f43885c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f43886d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f43887e;

        public d(ClipData clipData, int i10) {
            this.f43883a = clipData;
            this.f43884b = i10;
        }

        @Override // o3.c.InterfaceC0650c
        public c a() {
            return new c(new g(this));
        }

        @Override // o3.c.InterfaceC0650c
        public void b(Uri uri) {
            this.f43886d = uri;
        }

        @Override // o3.c.InterfaceC0650c
        public void setExtras(Bundle bundle) {
            this.f43887e = bundle;
        }

        @Override // o3.c.InterfaceC0650c
        public void setFlags(int i10) {
            this.f43885c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f43888a;

        public e(ContentInfo contentInfo) {
            this.f43888a = (ContentInfo) n3.h.g(contentInfo);
        }

        @Override // o3.c.f
        public int a() {
            return this.f43888a.getSource();
        }

        @Override // o3.c.f
        public ClipData b() {
            return this.f43888a.getClip();
        }

        @Override // o3.c.f
        public ContentInfo c() {
            return this.f43888a;
        }

        @Override // o3.c.f
        public int getFlags() {
            return this.f43888a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f43888a + "}";
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        int a();

        ClipData b();

        ContentInfo c();

        int getFlags();
    }

    /* loaded from: classes.dex */
    public static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f43889a;

        /* renamed from: b  reason: collision with root package name */
        public final int f43890b;

        /* renamed from: c  reason: collision with root package name */
        public final int f43891c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f43892d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f43893e;

        public g(d dVar) {
            this.f43889a = (ClipData) n3.h.g(dVar.f43883a);
            this.f43890b = n3.h.c(dVar.f43884b, 0, 5, "source");
            this.f43891c = n3.h.f(dVar.f43885c, 1);
            this.f43892d = dVar.f43886d;
            this.f43893e = dVar.f43887e;
        }

        @Override // o3.c.f
        public int a() {
            return this.f43890b;
        }

        @Override // o3.c.f
        public ClipData b() {
            return this.f43889a;
        }

        @Override // o3.c.f
        public ContentInfo c() {
            return null;
        }

        @Override // o3.c.f
        public int getFlags() {
            return this.f43891c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f43889a.getDescription());
            sb2.append(", source=");
            sb2.append(c.e(this.f43890b));
            sb2.append(", flags=");
            sb2.append(c.a(this.f43891c));
            if (this.f43892d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f43892d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f43893e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    public c(f fVar) {
        this.f43880a = fVar;
    }

    public static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    public static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static c g(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f43880a.b();
    }

    public int c() {
        return this.f43880a.getFlags();
    }

    public int d() {
        return this.f43880a.a();
    }

    public ContentInfo f() {
        return this.f43880a.c();
    }

    public String toString() {
        return this.f43880a.toString();
    }
}
