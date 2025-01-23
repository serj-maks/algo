package org.serjmaks.algo.search_in_rotated_sorted_array;

public class SearchInRotatedSortedArray {
    public static int run(int[] nums, int target) {
        //1. проверка, что массив не null и его длинна не равна 0
        if (nums == null || nums.length == 0) {
            return -1;
        }

        //2. подготовка к бинарному поиске индекса минимального элемента
        int left = 0;
        int right = nums.length - 1;

        //2.1. при помощи бинарного поиска ищем индекс минимального
        //элемента массива (точку отсчета (поворота, разрыва))
        while (left < right) {
            //2.2.
            int mid = left + (right - left) / 2;

            //2.3.
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        //3. подготовка к бинарному поиску индекса элемента target
        int start = left;
        left = 0;
        right = nums.length - 1;

        //3.1. после нахождения минимального элемента массива определяем,
        //где находится искомый элемент target -
        // - слева или справа от минимального элемента массива
        if (target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }

        //3.2. еще раз применяем бинарный поиск, но теперь проходим левую
        //или правую часть массива (в зависимости от того, что было
        //на предыдущем шаге) в поисках элемента target
        while (left <= right) {
            //3.3.
            int mid = left + (right - left) / 2;

            //3.4. если значение элемента с индексом mid == элементу target,
            //мы нашли элемент - возвращаем его индекс в массиве
            if (nums[mid] == target) {
                return mid;
            }

            //3.5. если на предыдущей проверки не нашли искомый элемент,
            //сужаем поиск при помощи бинарной сортировки
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        //4. если элемента с значением target в массиве нет - возвращаем -1
        return -1;
    }
}
