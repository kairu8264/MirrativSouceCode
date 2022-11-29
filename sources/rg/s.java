package rg;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class s {
    @RecentlyNonNull

    /* renamed from: e  reason: collision with root package name */
    public static final List<String> f51377e = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a  reason: collision with root package name */
    public final int f51378a;

    /* renamed from: b  reason: collision with root package name */
    public final int f51379b;

    /* renamed from: c  reason: collision with root package name */
    public final String f51380c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f51381d;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f51382a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f51383b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f51384c = null;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f51385d = new ArrayList();

        @RecentlyNonNull
        public s a() {
            return new s(this.f51382a, this.f51383b, this.f51384c, this.f51385d, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s(int i10, int i11, int i12, String str, List<String> list) {
        this.f51378a = i10;
        this.f51379b = i11;
        this.f51380c = i12;
        this.f51381d = str;
    }

    @RecentlyNonNull
    public String a() {
        String str = this.f51380c;
        return str == null ? "" : str;
    }

    public int b() {
        return this.f51378a;
    }

    public int c() {
        return this.f51379b;
    }

    @RecentlyNonNull
    public List<String> d() {
        return new ArrayList(this.f51381d);
    }
}
