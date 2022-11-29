package com.google.protobuf;

import com.google.protobuf.p0;
import java.io.IOException;

/* loaded from: classes4.dex */
public class z<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f28237a;

    /* renamed from: b  reason: collision with root package name */
    public final K f28238b;

    /* renamed from: c  reason: collision with root package name */
    public final V f28239c;

    /* loaded from: classes4.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final p0.b f28240a;

        /* renamed from: b  reason: collision with root package name */
        public final K f28241b;

        /* renamed from: c  reason: collision with root package name */
        public final p0.b f28242c;

        /* renamed from: d  reason: collision with root package name */
        public final V f28243d;

        public a(p0.b bVar, K k10, p0.b bVar2, V v10) {
            this.f28240a = bVar;
            this.f28241b = k10;
            this.f28242c = bVar2;
            this.f28243d = v10;
        }
    }

    public z(p0.b bVar, K k10, p0.b bVar2, V v10) {
        this.f28237a = new a<>(bVar, k10, bVar2, v10);
        this.f28238b = k10;
        this.f28239c = v10;
    }

    public static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return p.d(aVar.f28240a, 1, k10) + p.d(aVar.f28242c, 2, v10);
    }

    public static <K, V> z<K, V> d(p0.b bVar, K k10, p0.b bVar2, V v10) {
        return new z<>(bVar, k10, bVar2, v10);
    }

    public static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        p.z(codedOutputStream, aVar.f28240a, 1, k10);
        p.z(codedOutputStream, aVar.f28242c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.U(i10) + CodedOutputStream.C(b(this.f28237a, k10, v10));
    }

    public a<K, V> c() {
        return this.f28237a;
    }
}
