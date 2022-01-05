import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Exercise, ExerciseMode } from 'app/entities/exercise.model';

@Component({
    selector: 'jhi-mode-picker',
    templateUrl: './mode-picker.component.html',
    styles: ['.btn.disabled { pointer-events: none }', '.btn-group.disabled { cursor: not-allowed; }'],
})
export class ModePickerComponent {
    readonly INDIVIDUAL = ExerciseMode.INDIVIDUAL;
    readonly TEAM = ExerciseMode.TEAM;

    @Input() exercise: Exercise;
    @Input() disabled = false;

    @Output() ngModelChange = new EventEmitter<ExerciseMode>();

    /**
     * Set the mode and emit the changes to the parent component to notice changes
     * @param mode chosen exercise solving mode of type {ExerciseMode}
     */
    setMode(mode: ExerciseMode) {
        if (!this.disabled && mode !== this.exercise.mode) {
            this.exercise.mode = mode;
            this.ngModelChange.emit(mode);
        }
    }
}
