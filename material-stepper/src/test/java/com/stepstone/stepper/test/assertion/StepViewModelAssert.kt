package com.stepstone.stepper.test.assertion

import com.stepstone.stepper.viewmodel.StepViewModel
import org.assertj.core.api.AbstractAssert
import org.junit.Assert.assertEquals

/**
 * @author Piotr Zawadzki
 */
class StepViewModelAssert constructor(actual: StepViewModel) : AbstractAssert<StepViewModelAssert, StepViewModel>(actual, StepViewModelAssert::class.java) {

    companion object {

        fun assertThat(actual: StepViewModel): StepViewModelAssert {
            return StepViewModelAssert(actual)
        }

    }

    fun hasTitle(title: CharSequence?): StepViewModelAssert {
        assertEquals("Incorrect title!", title, actual.title)
        return this
    }

    fun hasNextButtonLabel(nextButtonLabel: CharSequence?): StepViewModelAssert {
        assertEquals("Incorrect label for the Next button!", nextButtonLabel, actual.nextButtonLabel)
        return this
    }

    fun hasCompleteButtonLabel(completeButtonLabel: CharSequence?): StepViewModelAssert {
        assertEquals("Incorrect label for the Complete button!", completeButtonLabel, actual.completeButtonLabel)
        return this
    }

    fun hasBackButtonLabel(backButtonLabel: CharSequence?): StepViewModelAssert {
        assertEquals("Incorrect label for the Back button!", backButtonLabel, actual.backButtonLabel)
        return this
    }

    fun hasNextButtonEndDrawableResId(nextButtonEndDrawableResId: Int): StepViewModelAssert {
        assertEquals("Incorrect drawable resource id for the Next button!", nextButtonEndDrawableResId, actual.nextButtonEndDrawableResId)
        return this
    }

    fun hasBackButtonStartDrawableResId(backButtonStartDrawableResId: Int): StepViewModelAssert {
        assertEquals("Incorrect drawable resource id for the Back button!", backButtonStartDrawableResId, actual.backButtonStartDrawableResId)
        return this
    }

}
