package com.dena.mirrorman.database;

import android.content.Context;
import jo.h;
import jo.p;
import v4.n0;
import v4.q0;
import w4.b;
import z4.g;
import zd.e;

/* loaded from: classes2.dex */
public abstract class MirrorDatabase extends q0 {

    /* renamed from: o  reason: collision with root package name */
    public static final a f25633o = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.dena.mirrorman.database.MirrorDatabase$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0225a extends b {
            public C0225a() {
                super(13, 14);
            }

            @Override // w4.b
            public void a(g gVar) {
                p.h(gVar, "database");
            }
        }

        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final MirrorDatabase a(Context context) {
            p.h(context, "context");
            q0 d10 = n0.a(context.getApplicationContext(), MirrorDatabase.class, "Mirror.db").f(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).b(new C0225a()).c().d();
            p.g(d10, "databaseBuilder(context.…\n                .build()");
            return (MirrorDatabase) d10;
        }
    }

    public abstract zd.b C();

    public abstract e D();
}
