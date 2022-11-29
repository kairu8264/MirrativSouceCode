package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Util;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class FloatResamplingAudioProcessor extends BaseAudioProcessor {
    private static final int FLOAT_NAN_AS_INT = Float.floatToIntBits(Float.NaN);
    private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10d;

    private static void writePcm32BitFloat(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR));
        if (floatToIntBits == FLOAT_NAN_AS_INT) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = audioFormat.encoding;
        if (Util.isEncodingHighResolutionPcm(i10)) {
            if (i10 != 4) {
                return new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4);
            }
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer replaceOutputBuffer;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.inputAudioFormat.encoding;
        if (i11 == 536870912) {
            replaceOutputBuffer = replaceOutputBuffer((i10 / 3) * 4);
            while (position < limit) {
                writePcm32BitFloat(((byteBuffer.get(position) & TagConstant.TAG_CAT_RESERVED) << 8) | ((byteBuffer.get(position + 1) & TagConstant.TAG_CAT_RESERVED) << 16) | ((byteBuffer.get(position + 2) & TagConstant.TAG_CAT_RESERVED) << 24), replaceOutputBuffer);
                position += 3;
            }
        } else if (i11 == 805306368) {
            replaceOutputBuffer = replaceOutputBuffer(i10);
            while (position < limit) {
                writePcm32BitFloat((byteBuffer.get(position) & TagConstant.TAG_CAT_RESERVED) | ((byteBuffer.get(position + 1) & TagConstant.TAG_CAT_RESERVED) << 8) | ((byteBuffer.get(position + 2) & TagConstant.TAG_CAT_RESERVED) << 16) | ((byteBuffer.get(position + 3) & TagConstant.TAG_CAT_RESERVED) << 24), replaceOutputBuffer);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        replaceOutputBuffer.flip();
    }
}
