package r3;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0754c f49738a;

    /* loaded from: classes.dex */
    public static final class b implements InterfaceC0754c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f49740a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f49741b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f49742c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f49740a = uri;
            this.f49741b = clipDescription;
            this.f49742c = uri2;
        }

        @Override // r3.c.InterfaceC0754c
        public Object a() {
            return null;
        }

        @Override // r3.c.InterfaceC0754c
        public Uri b() {
            return this.f49740a;
        }

        @Override // r3.c.InterfaceC0754c
        public void c() {
        }

        @Override // r3.c.InterfaceC0754c
        public Uri d() {
            return this.f49742c;
        }

        @Override // r3.c.InterfaceC0754c
        public ClipDescription e() {
            return this.f49741b;
        }
    }

    /* renamed from: r3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0754c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription e();
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f49738a = new a(uri, clipDescription, uri2);
        } else {
            this.f49738a = new b(uri, clipDescription, uri2);
        }
    }

    public static c f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f49738a.b();
    }

    public ClipDescription b() {
        return this.f49738a.e();
    }

    public Uri c() {
        return this.f49738a.d();
    }

    public void d() {
        this.f49738a.c();
    }

    public Object e() {
        return this.f49738a.a();
    }

    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0754c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f49739a;

        public a(Object obj) {
            this.f49739a = (InputContentInfo) obj;
        }

        @Override // r3.c.InterfaceC0754c
        public Object a() {
            return this.f49739a;
        }

        @Override // r3.c.InterfaceC0754c
        public Uri b() {
            return this.f49739a.getContentUri();
        }

        @Override // r3.c.InterfaceC0754c
        public void c() {
            this.f49739a.requestPermission();
        }

        @Override // r3.c.InterfaceC0754c
        public Uri d() {
            return this.f49739a.getLinkUri();
        }

        @Override // r3.c.InterfaceC0754c
        public ClipDescription e() {
            return this.f49739a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f49739a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public c(InterfaceC0754c interfaceC0754c) {
        this.f49738a = interfaceC0754c;
    }
}
