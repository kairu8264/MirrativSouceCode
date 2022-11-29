package com.google.firebase.remoteconfig.internal;

import vm.f;
import vm.g;

/* loaded from: classes4.dex */
public class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f28062a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28063b;

    /* renamed from: c  reason: collision with root package name */
    public final g f28064c;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f28065a;

        /* renamed from: b  reason: collision with root package name */
        public int f28066b;

        /* renamed from: c  reason: collision with root package name */
        public g f28067c;

        public d a() {
            return new d(this.f28065a, this.f28066b, this.f28067c);
        }

        public b b(g gVar) {
            this.f28067c = gVar;
            return this;
        }

        public b c(int i10) {
            this.f28066b = i10;
            return this;
        }

        public b d(long j10) {
            this.f28065a = j10;
            return this;
        }

        public b() {
        }
    }

    public static b b() {
        return new b();
    }

    @Override // vm.f
    public int a() {
        return this.f28063b;
    }

    public d(long j10, int i10, g gVar) {
        this.f28062a = j10;
        this.f28063b = i10;
        this.f28064c = gVar;
    }
}
