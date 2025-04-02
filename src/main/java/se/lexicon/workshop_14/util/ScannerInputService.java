package se.lexicon.workshop_14.service;

import org.springframework.stereotype.Component;
import se.lexicon.workshop_14.data_access.UserInputService;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService {

    public Scanner scanner;

    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        int nextInt = scanner.nextInt();
        scanner.nextLine();
        return nextInt;
    }
}
