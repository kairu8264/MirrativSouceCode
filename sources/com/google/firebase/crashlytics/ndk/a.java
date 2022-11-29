package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import cl.c0;
import fl.f;
import xk.g;

/* loaded from: classes4.dex */
public class a implements xk.a {

    /* renamed from: e  reason: collision with root package name */
    public static a f27952e;

    /* renamed from: a  reason: collision with root package name */
    public final ll.b f27953a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27954b;

    /* renamed from: c  reason: collision with root package name */
    public String f27955c;

    /* renamed from: d  reason: collision with root package name */
    public InterfaceC0251a f27956d;

    /* renamed from: com.google.firebase.crashlytics.ndk.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0251a {
        void a();
    }

    public a(ll.b bVar, boolean z10) {
        this.f27953a = bVar;
        this.f27954b = z10;
    }

    public static a f(Context context, boolean z10) {
        a aVar = new a(new ll.b(context, new JniNativeApi(context), new f(context)), z10);
        f27952e = aVar;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, String str2, long j10, c0 c0Var) {
        xk.f f10 = xk.f.f();
        f10.b("Initializing native session: " + str);
        if (this.f27953a.d(str, str2, j10, c0Var)) {
            return;
        }
        xk.f f11 = xk.f.f();
        f11.k("Failed to initialize Crashlytics NDK for session " + str);
    }

    @Override // xk.a
    public g a(String str) {
        return new ll.f(this.f27953a.a(str));
    }

    @Override // xk.a
    public boolean b() {
        String str = this.f27955c;
        return str != null && d(str);
    }

    @Override // xk.a
    public synchronized void c(final String str, final String str2, final long j10, final c0 c0Var) {
        this.f27955c = str;
        InterfaceC0251a interfaceC0251a = new InterfaceC0251a() { // from class: ll.c
            @Override // com.google.firebase.crashlytics.ndk.a.InterfaceC0251a
            public final void a() {
                com.google.firebase.crashlytics.ndk.a.this.g(str, str2, j10, c0Var);
            }
        };
        this.f27956d = interfaceC0251a;
        if (this.f27954b) {
            interfaceC0251a.a();
        }
    }

    @Override // xk.a
    public boolean d(String str) {
        return this.f27953a.c(str);
    }
}
