package pi;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class pa {

    /* renamed from: a  reason: collision with root package name */
    public final b5 f48140a;

    public pa(b5 b5Var) {
        this.f48140a = b5Var;
    }

    public final void a(String str, Bundle bundle) {
        String uri;
        this.f48140a.a().f();
        if (this.f48140a.m()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = TtmlNode.TEXT_EMPHASIS_AUTO;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.f48140a.E().f47841u.b(uri);
        this.f48140a.E().f47842v.b(this.f48140a.c().currentTimeMillis());
    }

    public final void b() {
        this.f48140a.a().f();
        if (d()) {
            if (e()) {
                this.f48140a.E().f47841u.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f48140a.I().t(TtmlNode.TEXT_EMPHASIS_AUTO, "_cmpx", bundle);
            } else {
                String a10 = this.f48140a.E().f47841u.a();
                if (TextUtils.isEmpty(a10)) {
                    this.f48140a.r().s().a("Cache still valid but referrer not found");
                } else {
                    long a11 = ((this.f48140a.E().f47842v.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a11);
                    Object obj = pair.first;
                    this.f48140a.I().t(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f48140a.E().f47841u.b(null);
            }
            this.f48140a.E().f47842v.b(0L);
        }
    }

    public final void c() {
        if (d() && e()) {
            this.f48140a.E().f47841u.b(null);
        }
    }

    public final boolean d() {
        return this.f48140a.E().f47842v.a() > 0;
    }

    public final boolean e() {
        return d() && this.f48140a.c().currentTimeMillis() - this.f48140a.E().f47842v.a() > this.f48140a.y().p(null, c3.S);
    }
}
