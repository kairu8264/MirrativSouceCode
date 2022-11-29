package rg;

import ai.vv;
import ai.wv;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Date;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final wv f51345a;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final vv f51346a;

        public a() {
            vv vvVar = new vv();
            this.f51346a = vvVar;
            vvVar.y("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @RecentlyNonNull
        public a a(@RecentlyNonNull String str) {
            this.f51346a.w(str);
            return this;
        }

        @RecentlyNonNull
        public a b(@RecentlyNonNull Class<Object> cls, @RecentlyNonNull Bundle bundle) {
            this.f51346a.x(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f51346a.z("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        @RecentlyNonNull
        public f c() {
            return new f(this);
        }

        @RecentlyNonNull
        public a d(@RecentlyNonNull Location location) {
            this.f51346a.b(location);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final a e(@RecentlyNonNull String str) {
            this.f51346a.y(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final a f(@RecentlyNonNull Date date) {
            this.f51346a.A(date);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final a g(int i10) {
            this.f51346a.a(i10);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final a h(boolean z10) {
            this.f51346a.c(z10);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final a i(boolean z10) {
            this.f51346a.d(z10);
            return this;
        }
    }

    public f(@RecentlyNonNull a aVar) {
        this.f51345a = new wv(aVar.f51346a, null);
    }

    public wv a() {
        return this.f51345a;
    }
}
