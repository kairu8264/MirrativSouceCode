package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public class i {
    public static int a(Fragment fragment, boolean z10, boolean z11) {
        if (z11) {
            if (z10) {
                return fragment.K0();
            }
            return fragment.L0();
        } else if (z10) {
            return fragment.s0();
        } else {
            return fragment.w0();
        }
    }

    public static a b(Context context, Fragment fragment, boolean z10, boolean z11) {
        int G0 = fragment.G0();
        int a10 = a(fragment, z10, z11);
        boolean z12 = false;
        fragment.U2(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f15129d0;
        if (viewGroup != null) {
            int i10 = g4.b.f32628c;
            if (viewGroup.getTag(i10) != null) {
                fragment.f15129d0.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.f15129d0;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation B1 = fragment.B1(G0, z10, a10);
            if (B1 != null) {
                return new a(B1);
            }
            Animator C1 = fragment.C1(G0, z10, a10);
            if (C1 != null) {
                return new a(C1);
            }
            if (a10 == 0 && G0 != 0) {
                a10 = d(context, G0, z10);
            }
            if (a10 != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(a10));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, a10);
                        if (loadAnimation != null) {
                            return new a(loadAnimation);
                        }
                        z12 = true;
                    } catch (Resources.NotFoundException e10) {
                        throw e10;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z12) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, a10);
                        if (loadAnimator != null) {
                            return new a(loadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (!equals) {
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a10);
                            if (loadAnimation2 != null) {
                                return new a(loadAnimation2);
                            }
                        } else {
                            throw e11;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static int c(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? g4.a.f32624e : g4.a.f32625f;
        } else if (i10 == 8194) {
            return z10 ? g4.a.f32620a : g4.a.f32621b;
        } else if (i10 == 8197) {
            if (z10) {
                return c(context, 16842938);
            }
            return c(context, 16842939);
        } else if (i10 == 4099) {
            return z10 ? g4.a.f32622c : g4.a.f32623d;
        } else if (i10 != 4100) {
            return -1;
        } else {
            if (z10) {
                return c(context, 16842936);
            }
            return c(context, 16842937);
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f15357a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f15358b;

        public a(Animation animation) {
            this.f15357a = animation;
            this.f15358b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f15357a = null;
            this.f15358b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {
        public boolean A;

        /* renamed from: w  reason: collision with root package name */
        public final ViewGroup f15359w;

        /* renamed from: x  reason: collision with root package name */
        public final View f15360x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f15361y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f15362z;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.A = true;
            this.f15359w = viewGroup;
            this.f15360x = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.A = true;
            if (this.f15361y) {
                return !this.f15362z;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f15361y = true;
                o3.y.a(this.f15359w, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f15361y && this.A) {
                this.A = false;
                this.f15359w.post(this);
                return;
            }
            this.f15359w.endViewTransition(this.f15360x);
            this.f15362z = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.A = true;
            if (this.f15361y) {
                return !this.f15362z;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f15361y = true;
                o3.y.a(this.f15359w, this);
            }
            return true;
        }
    }
}
