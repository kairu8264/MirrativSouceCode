package gg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final d f33566c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    public final String f33567a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f33568b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f33569a = "";

        /* renamed from: b  reason: collision with root package name */
        public List<c> f33570b = new ArrayList();

        public d a() {
            return new d(this.f33569a, Collections.unmodifiableList(this.f33570b));
        }

        public a b(List<c> list) {
            this.f33570b = list;
            return this;
        }

        public a c(String str) {
            this.f33569a = str;
            return this;
        }
    }

    public d(String str, List<c> list) {
        this.f33567a = str;
        this.f33568b = list;
    }

    public static a c() {
        return new a();
    }

    @tl.d(tag = 2)
    public List<c> a() {
        return this.f33568b;
    }

    @tl.d(tag = 1)
    public String b() {
        return this.f33567a;
    }
}
