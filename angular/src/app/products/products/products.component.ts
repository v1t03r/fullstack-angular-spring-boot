import {Component} from '@angular/core';
import {MatDialog} from '@angular/material/dialog';
import {Observable, of} from 'rxjs';
import {catchError} from 'rxjs/operators';

import {ErrorDialogComponent} from '../../shared/components/error-dialog/error-dialog.component';
import {Product} from '../model/product';
import {ProductsService} from '../services/products.service';

@Component({
    selector: 'app-courses',
    templateUrl: './products.component.html',
    styleUrls: ['./products.component.scss']
})
export class ProductsComponent {

    courses$: Observable<Product[]>;
    displayedColumns = ['name', 'photo', 'description', 'category'];

    constructor(
        private coursesService: ProductsService,
        public dialog: MatDialog
    ) {

        this.courses$ = this.coursesService.list()
            .pipe(
                catchError(error => {
                    this.onError('Erro ao carregar cursos.');
                    return of([])
                })
            );
    }

    onError(errorMsg: string) {
        this.dialog.open(ErrorDialogComponent, {
            data: errorMsg
        });
    }

}
