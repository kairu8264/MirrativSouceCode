package s9;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.feature.event.LandingPageDescriptionListView;
import com.dena.mirrorman.feature.event.LandingPageTitleView;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: r1  reason: collision with root package name */
    public static final ViewDataBinding.i f52491r1 = null;

    /* renamed from: s1  reason: collision with root package name */
    public static final SparseIntArray f52492s1;

    /* renamed from: k1  reason: collision with root package name */
    public final ConstraintLayout f52493k1;

    /* renamed from: l1  reason: collision with root package name */
    public final AppCompatTextView f52494l1;

    /* renamed from: m1  reason: collision with root package name */
    public final AppCompatTextView f52495m1;

    /* renamed from: n1  reason: collision with root package name */
    public final View f52496n1;

    /* renamed from: o1  reason: collision with root package name */
    public final View f52497o1;

    /* renamed from: p1  reason: collision with root package name */
    public final AppCompatTextView f52498p1;

    /* renamed from: q1  reason: collision with root package name */
    public long f52499q1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f52492s1 = sparseIntArray;
        sparseIntArray.put(q9.g.event_title_container, 57);
        sparseIntArray.put(q9.g.event_info_reward_type_anchor_view, 58);
        sparseIntArray.put(q9.g.event_info_reward_type_ranking_container, 59);
        sparseIntArray.put(q9.g.event_info_reward_type_point_container, 60);
        sparseIntArray.put(q9.g.event_info_reward_type_ranking_image_view, 61);
        sparseIntArray.put(q9.g.event_info_reward_type_point_image_view, 62);
        sparseIntArray.put(q9.g.event_info_reward_point_type_anchor_view, 63);
        sparseIntArray.put(q9.g.reward_inner_container, 64);
        sparseIntArray.put(q9.g.reward_header_container, 65);
        sparseIntArray.put(q9.g.reward_header_bottom_divider, 66);
        sparseIntArray.put(q9.g.reward_profile_container, 67);
        sparseIntArray.put(q9.g.reward_profile_info_container, 68);
        sparseIntArray.put(q9.g.reward_profile_result_point_image_view, 69);
        sparseIntArray.put(q9.g.reward_profile_result_point_prefix_text_view, 70);
        sparseIntArray.put(q9.g.reward_list_container, 71);
        sparseIntArray.put(q9.g.reward_list_grade_help_text_view, 72);
        sparseIntArray.put(q9.g.reward_list_grade_help_image_view, 73);
        sparseIntArray.put(q9.g.reward_list_reward_image_container, 74);
        sparseIntArray.put(q9.g.reward_list_recycler_view, 75);
        sparseIntArray.put(q9.g.reward_list_grade_help_container_center, 76);
        sparseIntArray.put(q9.g.reward_list_grade_rule_changed_popup, 77);
        sparseIntArray.put(q9.g.reward_profile_result_grade_image_view, 78);
        sparseIntArray.put(q9.g.broadcaster_reward_inner_container, 79);
        sparseIntArray.put(q9.g.broadcaster_reward_header_container, 80);
        sparseIntArray.put(q9.g.broadcaster_reward_header_bottom_divider, 81);
        sparseIntArray.put(q9.g.broadcaster_reward_profile_container, 82);
        sparseIntArray.put(q9.g.broadcaster_reward_profile_info_container, 83);
        sparseIntArray.put(q9.g.broadcaster_reward_profile_result_point_image_view, 84);
        sparseIntArray.put(q9.g.broadcaster_reward_profile_result_point_prefix_text_view, 85);
        sparseIntArray.put(q9.g.broadcaster_reward_list_recycler_view, 86);
        sparseIntArray.put(q9.g.broadcaster_reward_profile_result_grade_image_view, 87);
        sparseIntArray.put(q9.g.O2, 88);
        sparseIntArray.put(q9.g.immediate_broadcaster_rank_shadow_view, 89);
        sparseIntArray.put(q9.g.immediate_broadcaster_rank_view, 90);
        sparseIntArray.put(q9.g.close_button_container, 91);
    }

    public h(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 92, f52491r1, f52492s1));
    }

    public final boolean A0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 34359738368L;
            }
            return true;
        }
        return false;
    }

    public final boolean B0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 16777216;
            }
            return true;
        }
        return false;
    }

    public final boolean C0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 256;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return y0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return J0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return k0((androidx.lifecycle.e0) obj, i11);
            case 3:
                return E0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return F0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return v0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return P0((androidx.lifecycle.e0) obj, i11);
            case 7:
                return p0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return C0((androidx.lifecycle.e0) obj, i11);
            case 9:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 10:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return l0((androidx.lifecycle.e0) obj, i11);
            case 12:
                return O0((androidx.lifecycle.e0) obj, i11);
            case 13:
                return K0((androidx.lifecycle.e0) obj, i11);
            case 14:
                return V((androidx.lifecycle.e0) obj, i11);
            case 15:
                return s0((androidx.lifecycle.e0) obj, i11);
            case 16:
                return D0((androidx.lifecycle.e0) obj, i11);
            case 17:
                return r0((androidx.lifecycle.e0) obj, i11);
            case 18:
                return R0((androidx.lifecycle.e0) obj, i11);
            case 19:
                return u0((androidx.lifecycle.e0) obj, i11);
            case 20:
                return W((androidx.lifecycle.e0) obj, i11);
            case 21:
                return q0((androidx.lifecycle.e0) obj, i11);
            case 22:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 23:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 24:
                return B0((androidx.lifecycle.e0) obj, i11);
            case 25:
                return x0((androidx.lifecycle.e0) obj, i11);
            case 26:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 27:
                return h0((androidx.lifecycle.e0) obj, i11);
            case 28:
                return N0((androidx.lifecycle.e0) obj, i11);
            case 29:
                return I0((androidx.lifecycle.e0) obj, i11);
            case 30:
                return n0((androidx.lifecycle.e0) obj, i11);
            case 31:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 32:
                return G0((androidx.lifecycle.e0) obj, i11);
            case 33:
                return t0((androidx.lifecycle.e0) obj, i11);
            case 34:
                return o0((androidx.lifecycle.e0) obj, i11);
            case 35:
                return A0((androidx.lifecycle.e0) obj, i11);
            case 36:
                return U((androidx.lifecycle.e0) obj, i11);
            case 37:
                return g0((androidx.lifecycle.e0) obj, i11);
            case 38:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 39:
                return w0((androidx.lifecycle.e0) obj, i11);
            case 40:
                return M0((androidx.lifecycle.e0) obj, i11);
            case 41:
                return m0((androidx.lifecycle.e0) obj, i11);
            case 42:
                return H0((androidx.lifecycle.e0) obj, i11);
            case 43:
                return z0((androidx.lifecycle.e0) obj, i11);
            case 44:
                return i0((androidx.lifecycle.e0) obj, i11);
            case 45:
                return X((androidx.lifecycle.e0) obj, i11);
            case 46:
                return j0((androidx.lifecycle.e0) obj, i11);
            case 47:
                return L0((androidx.lifecycle.e0) obj, i11);
            case 48:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 49:
                return Q0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    public final boolean D0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean E0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean F0(androidx.lifecycle.e0<SpannableString> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean G0(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 4294967296L;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 4398046511104L;
            }
            return true;
        }
        return false;
    }

    public final boolean I0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 536870912;
            }
            return true;
        }
        return false;
    }

    public final boolean J0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean K0(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean L0(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 140737488355328L;
            }
            return true;
        }
        return false;
    }

    public final boolean M0(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 1099511627776L;
            }
            return true;
        }
        return false;
    }

    public final boolean N0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 268435456;
            }
            return true;
        }
        return false;
    }

    public final boolean O0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        }
        return false;
    }

    public final boolean P0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean Q0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 562949953421312L;
            }
            return true;
        }
        return false;
    }

    public final boolean R0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        }
        return false;
    }

    @Override // s9.g
    public void T(z9.l lVar) {
        this.f52474j1 = lVar;
        synchronized (this) {
            this.f52499q1 |= 1125899906842624L;
        }
        c(q9.a.f48787b);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 68719476736L;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<SpannableString> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 35184372088832L;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 67108864;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 274877906944L;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 281474976710656L;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 4194304;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 8388608;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<SpannableString> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 2147483648L;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean g0(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 137438953472L;
            }
            return true;
        }
        return false;
    }

    public final boolean h0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 134217728;
            }
            return true;
        }
        return false;
    }

    public final boolean i0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 17592186044416L;
            }
            return true;
        }
        return false;
    }

    public final boolean j0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 70368744177664L;
            }
            return true;
        }
        return false;
    }

    public final boolean k0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 4;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0170  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 3252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.h.l():void");
    }

    public final boolean l0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean m0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 2199023255552L;
            }
            return true;
        }
        return false;
    }

    public final boolean n0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 1073741824;
            }
            return true;
        }
        return false;
    }

    public final boolean o0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 17179869184L;
            }
            return true;
        }
        return false;
    }

    public final boolean p0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean q0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean r0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean s0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean t0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 8589934592L;
            }
            return true;
        }
        return false;
    }

    public final boolean u0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean v0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 32;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f52499q1 != 0;
        }
    }

    public final boolean w0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 549755813888L;
            }
            return true;
        }
        return false;
    }

    public final boolean x0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 33554432;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f52499q1 = 2251799813685248L;
        }
        H();
    }

    public final boolean y0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean z0(androidx.lifecycle.e0<SpannableString> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52499q1 |= 8796093022208L;
            }
            return true;
        }
        return false;
    }

    public h(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 50, (ConstraintLayout) objArr[34], (View) objArr[81], (ConstraintLayout) objArr[80], (View) objArr[45], (AppCompatTextView) objArr[35], (ConstraintLayout) objArr[79], (ConstraintLayout) objArr[48], (AppCompatTextView) objArr[49], (RecyclerView) objArr[86], (AppCompatImageView) objArr[40], (AppCompatImageView) objArr[41], (ConstraintLayout) objArr[82], (AppCompatImageView) objArr[39], (ConstraintLayout) objArr[83], (AppCompatTextView) objArr[42], (AppCompatImageView) objArr[43], (AppCompatTextView) objArr[44], (ConstraintLayout) objArr[46], (ConstraintLayout) objArr[50], (AppCompatImageView) objArr[87], (AppCompatTextView) objArr[51], (AppCompatImageView) objArr[84], (AppCompatTextView) objArr[85], (AppCompatTextView) objArr[47], (ConstraintLayout) objArr[36], (AppCompatImageView) objArr[37], (AppCompatTextView) objArr[38], (ConstraintLayout) objArr[91], (LandingPageDescriptionListView) objArr[55], (AppCompatImageView) objArr[1], (ConstraintLayout) objArr[2], (View) objArr[63], (ConstraintLayout) objArr[10], (View) objArr[58], (ConstraintLayout) objArr[3], (View) objArr[4], (View) objArr[60], (AppCompatImageView) objArr[62], (View) objArr[11], (View) objArr[12], (AppCompatTextView) objArr[6], (View) objArr[59], (AppCompatImageView) objArr[61], (AppCompatTextView) objArr[5], (ConstraintLayout) objArr[52], (LandingPageTitleView) objArr[57], (View) objArr[89], (ComposeView) objArr[90], (AppCompatTextView) objArr[54], (RecyclerView) objArr[88], (AppCompatTextView) objArr[53], (ConstraintLayout) objArr[15], (View) objArr[66], (ConstraintLayout) objArr[65], (View) objArr[25], (ConstraintLayout) objArr[64], (ConstraintLayout) objArr[71], (ConstraintLayout) objArr[29], (Space) objArr[76], (AppCompatImageView) objArr[73], (AppCompatTextView) objArr[72], (AppCompatImageView) objArr[77], (AppCompatTextView) objArr[28], (RecyclerView) objArr[75], (ConstraintLayout) objArr[74], (AppCompatImageView) objArr[30], (AppCompatImageView) objArr[20], (AppCompatImageView) objArr[21], (ConstraintLayout) objArr[67], (AppCompatImageView) objArr[19], (ConstraintLayout) objArr[68], (AppCompatTextView) objArr[22], (AppCompatImageView) objArr[23], (AppCompatTextView) objArr[24], (ConstraintLayout) objArr[26], (ConstraintLayout) objArr[32], (AppCompatImageView) objArr[78], (AppCompatTextView) objArr[33], (AppCompatImageView) objArr[69], (AppCompatTextView) objArr[70], (AppCompatTextView) objArr[27], (ConstraintLayout) objArr[16], (AppCompatImageView) objArr[17], (AppCompatTextView) objArr[18], (RecyclerView) objArr[7], (ConstraintLayout) objArr[8]);
        this.f52499q1 = -1L;
        this.B.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.N.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.T.setTag(null);
        this.V.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        this.f52455a0.setTag(null);
        this.f52457b0.setTag(null);
        this.f52461d0.setTag(null);
        this.f52463e0.setTag(null);
        this.f52465f0.setTag(null);
        this.f52469h0.setTag(null);
        this.f52473j0.setTag(null);
        this.f52475k0.setTag(null);
        this.f52478n0.setTag(null);
        this.f52479o0.setTag(null);
        this.f52480p0.setTag(null);
        this.f52483s0.setTag(null);
        this.f52484t0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f52493k1 = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[13];
        this.f52494l1 = appCompatTextView;
        appCompatTextView.setTag(null);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[14];
        this.f52495m1 = appCompatTextView2;
        appCompatTextView2.setTag(null);
        View view2 = (View) objArr[31];
        this.f52496n1 = view2;
        view2.setTag(null);
        View view3 = (View) objArr[56];
        this.f52497o1 = view3;
        view3.setTag(null);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[9];
        this.f52498p1 = appCompatTextView3;
        appCompatTextView3.setTag(null);
        this.f52488x0.setTag(null);
        this.f52490z0.setTag(null);
        this.A0.setTag(null);
        this.D0.setTag(null);
        this.G0.setTag(null);
        this.L0.setTag(null);
        this.O0.setTag(null);
        this.P0.setTag(null);
        this.Q0.setTag(null);
        this.S0.setTag(null);
        this.U0.setTag(null);
        this.V0.setTag(null);
        this.W0.setTag(null);
        this.X0.setTag(null);
        this.Y0.setTag(null);
        this.f52456a1.setTag(null);
        this.f52462d1.setTag(null);
        this.f52464e1.setTag(null);
        this.f52466f1.setTag(null);
        this.f52468g1.setTag(null);
        this.f52470h1.setTag(null);
        this.f52472i1.setTag(null);
        N(view);
        y();
    }
}
