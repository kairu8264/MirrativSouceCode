package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c;
import java.util.Set;
import ph.j;
import rh.c;
import rh.i;
import rh.p;

/* loaded from: classes3.dex */
public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0236a<?, O> f27180a;

    /* renamed from: b  reason: collision with root package name */
    public final g<?> f27181b;

    /* renamed from: c  reason: collision with root package name */
    public final String f27182c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0236a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, rh.d dVar, O o10, c.a aVar, c.b bVar) {
            return b(context, looper, dVar, o10, aVar, bVar);
        }

        public T b(Context context, Looper looper, rh.d dVar, O o10, ph.d dVar2, j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    /* loaded from: classes3.dex */
    public static class c<C extends b> {
    }

    /* loaded from: classes3.dex */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f27183a = new c(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0237a extends d {
            Account b();
        }

        /* loaded from: classes3.dex */
        public interface b extends d {
            GoogleSignInAccount a();
        }

        /* loaded from: classes3.dex */
        public static final class c implements d {
            public c() {
            }

            public /* synthetic */ c(oh.g gVar) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class e<T extends b, O> {
    }

    /* loaded from: classes3.dex */
    public interface f extends b {
        void a(String str);

        boolean b();

        String c();

        void d(c.e eVar);

        void disconnect();

        boolean e();

        boolean f();

        Set<Scope> h();

        boolean isConnected();

        void j(i iVar, Set<Scope> set);

        void k(c.InterfaceC0781c interfaceC0781c);

        int l();

        nh.c[] m();

        String n();
    }

    /* loaded from: classes3.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0236a<C, O> abstractC0236a, g<C> gVar) {
        p.j(abstractC0236a, "Cannot construct an Api with a null ClientBuilder");
        p.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f27182c = str;
        this.f27180a = abstractC0236a;
        this.f27181b = gVar;
    }

    public final AbstractC0236a<?, O> a() {
        return this.f27180a;
    }

    public final c<?> b() {
        return this.f27181b;
    }

    public final String c() {
        return this.f27182c;
    }
}
