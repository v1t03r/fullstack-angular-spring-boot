import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'currency'
})
export class CurrencyPipe implements PipeTransform {

  transform(value: string): string {
    switch(value) {
      case 'euro': return 'euro';
    }
    return 'euro';
  }

}
