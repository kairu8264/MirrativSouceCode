package rb;

import android.content.Context;
import android.media.SoundPool;
import android.util.SparseIntArray;
import hb.a2;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f50707d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f50708e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final List<Integer> f50709f = s.m(Integer.valueOf(a2.quiz_answer_correct), Integer.valueOf(a2.quiz_answer_incorrect), Integer.valueOf(a2.quiz_congrats_show), Integer.valueOf(a2.quiz_question_bgm), Integer.valueOf(a2.quiz_question_show), Integer.valueOf(a2.quiz_question_timeup));

    /* renamed from: a  reason: collision with root package name */
    public SoundPool f50710a;

    /* renamed from: b  reason: collision with root package name */
    public SparseIntArray f50711b;

    /* renamed from: c  reason: collision with root package name */
    public int f50712c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public d(Context context) {
        p.h(context, "context");
        this.f50711b = new SparseIntArray();
        List<Integer> list = f50709f;
        this.f50710a = new SoundPool(list.size(), 3, 0);
        for (Integer num : list) {
            int intValue = num.intValue();
            SoundPool soundPool = this.f50710a;
            if (soundPool != null) {
                this.f50711b.put(intValue, soundPool.load(context, intValue, 0));
            }
        }
    }

    public final void a(int i10, boolean z10) {
        if (this.f50710a == null) {
            return;
        }
        c();
        int i11 = z10 ? -1 : 0;
        int i12 = this.f50711b.get(i10);
        SoundPool soundPool = this.f50710a;
        this.f50712c = soundPool != null ? soundPool.play(i12, 0.2f, 0.2f, 0, i11, 1.0f) : 0;
    }

    public final void b() {
        SoundPool soundPool = this.f50710a;
        if (soundPool == null) {
            return;
        }
        if (soundPool != null) {
            soundPool.release();
        }
        this.f50710a = null;
        this.f50711b.clear();
    }

    public final void c() {
        int i10 = this.f50712c;
        if (i10 == 0) {
            return;
        }
        SoundPool soundPool = this.f50710a;
        if (soundPool != null) {
            soundPool.stop(i10);
        }
        this.f50712c = 0;
    }
}
