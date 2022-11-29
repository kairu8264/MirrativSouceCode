package bc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Karaoke;
import com.dena.mirrorman.net.api.response.Singer;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f17301g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f17302h = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17303a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Singer> f17304b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Karaoke> f17305c;

    /* renamed from: d  reason: collision with root package name */
    public final io.l<Singer, wn.v> f17306d;

    /* renamed from: e  reason: collision with root package name */
    public final io.l<Karaoke, wn.v> f17307e;

    /* renamed from: f  reason: collision with root package name */
    public final io.l<Karaoke, wn.v> f17308f;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, List<Singer> list, List<Karaoke> list2, io.l<? super Singer, wn.v> lVar, io.l<? super Karaoke, wn.v> lVar2, io.l<? super Karaoke, wn.v> lVar3) {
        jo.p.h(context, "context");
        jo.p.h(list, "recommendSingers");
        jo.p.h(list2, "songs");
        jo.p.h(lVar, "onClickSinger");
        jo.p.h(lVar2, "onClickSong");
        jo.p.h(lVar3, "onClickSetting");
        this.f17303a = context;
        this.f17304b = list;
        this.f17305c = list2;
        this.f17306d = lVar;
        this.f17307e = lVar2;
        this.f17308f = lVar3;
    }

    public static final void d(f fVar, Karaoke karaoke, View view) {
        jo.p.h(fVar, "this$0");
        jo.p.h(karaoke, "$song");
        fVar.f17307e.invoke(karaoke);
    }

    public static final void f(f fVar, Karaoke karaoke, View view) {
        jo.p.h(fVar, "this$0");
        jo.p.h(karaoke, "$song");
        fVar.f17308f.invoke(karaoke);
    }

    public final int c() {
        return this.f17304b.isEmpty() ? 1 : 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f17305c.size() + c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (this.f17304b.isEmpty()) {
            if (i10 != 0) {
                return 3;
            }
        } else if (i10 == 0) {
            return 0;
        } else {
            if (i10 == 1) {
                return 1;
            }
            if (i10 != 2) {
                return 3;
            }
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        int itemViewType = getItemViewType(i10);
        if (itemViewType == 0) {
            int i11 = xb.n.ic_recommended_artist;
            String string = this.f17303a.getString(xb.r.text_karaoke_similar_singers);
            jo.p.g(string, "context.getString(R.stri…_karaoke_similar_singers)");
            ((y2) e0Var).a(i11, string);
        } else if (itemViewType == 1) {
            ((j) e0Var).a(this.f17304b, this.f17306d);
        } else if (itemViewType == 2) {
            int i12 = xb.n.ic_recommended_song;
            String string2 = this.f17303a.getString(xb.r.text_karaoke_recommended_songs);
            jo.p.g(string2, "context.getString(R.stri…araoke_recommended_songs)");
            ((y2) e0Var).a(i12, string2);
        } else if (itemViewType != 3) {
        } else {
            c0 c0Var = (c0) e0Var;
            final Karaoke karaoke = this.f17305c.get(i10 - c());
            c0Var.a(karaoke);
            c0Var.b().u().setOnClickListener(new View.OnClickListener() { // from class: bc.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.d(f.this, karaoke, view);
                }
            });
            c0Var.b().B.setOnClickListener(new View.OnClickListener() { // from class: bc.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.f(f.this, karaoke, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 != 0) {
            if (i10 == 1) {
                return j.f17361b.a(viewGroup);
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return c0.f17278y.a(viewGroup);
                }
                throw new IllegalArgumentException();
            }
        }
        return y2.f17519b.a(viewGroup);
    }
}
