package pe.lacafetalab.mooc.steps.domain.video;

import pe.lacafetalab.shared.domain.WordMother;

public final class VideoStepTextMother {
    public static VideoStepText create(String value) {
        return new VideoStepText(value);
    }

    public static VideoStepText random() {
        return create(WordMother.random());
    }
}
