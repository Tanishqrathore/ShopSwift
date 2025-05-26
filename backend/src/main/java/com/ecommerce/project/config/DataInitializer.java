//package com.ecommerce.project.config;
//
//import com.ecommerce.project.model.Category;
//import com.ecommerce.project.model.Product;
//import com.ecommerce.project.repositories.CategoryRepository;
//import com.ecommerce.project.repositories.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class DataInitializer implements CommandLineRunner {
//
//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        createCategoryWithProducts("Electronics", "Latest gadgets and smart devices.",
//                new String[]{"Budget Gaming Laptop", "Bluetooth Headphones", "Smartwatch Lite", "Full HD LED TV"},
//                new String[]{
//                        "Affordable gaming laptop with decent specs.",
//                        "Wireless headphones with noise cancellation.",
//                        "Smartwatch with essential fitness tracking features.",
//                        "Full HD LED TV with vibrant display."
//                },
//                new double[]{1499, 199, 129, 799});
//
//        createCategoryWithProducts("Fashion", "Trendy and stylish wearables.",
//                new String[]{"Casual Hoodie", "Stylish Sunglasses", "Leather Wallet", "Sport Sneakers"},
//                new String[]{
//                        "Comfortable hoodie for daily wear.",
//                        "Polarized sunglasses for UV protection.",
//                        "Premium leather wallet with RFID protection.",
//                        "Lightweight sneakers for running and gym."
//                },
//                new double[]{59, 49, 39, 99});
//
//        createCategoryWithProducts("Home Appliances", "Smart and efficient home solutions.",
//                new String[]{"Portable Air Purifier", "Automatic Coffee Maker", "Cordless Vacuum Cleaner", "Electric Kettle"},
//                new String[]{
//                        "Compact air purifier for clean indoor air.",
//                        "Auto-brewing coffee maker for perfect mornings.",
//                        "Lightweight vacuum cleaner for effortless cleaning.",
//                        "Fast-heating electric kettle for instant hot water."
//                },
//                new double[]{149, 129, 179, 69});
//
//        createCategoryWithProducts("Fitness & Sports", "Gear for an active lifestyle.",
//                new String[]{"Resistance Bands Set", "Running Shoes", "Premium Yoga Mat", "Smart Fitness Tracker"},
//                new String[]{
//                        "Set of resistance bands for full-body workouts.",
//                        "High-performance running shoes for all terrains.",
//                        "Non-slip yoga mat with extra cushioning.",
//                        "Fitness tracker with heart rate and step count."
//                },
//                new double[]{49, 119, 39, 149});
//    }
//
//    private void createCategoryWithProducts(String categoryName, String description, String[] productNames, String[] productDescriptions, double[] prices) {
//        Category category = categoryRepository.findByCategoryName(categoryName);
//        if (category == null) {
//            category = new Category();
//            category.setCategoryName(categoryName);
//            category = categoryRepository.save(category);
//        }
//
//        for (int i = 0; i < productNames.length; i++) {
//
//
//            Product product = new Product();
//            product.setProductName(productNames[i]);
//            product.setDescription(productDescriptions[i]);
//            product.setPrice(prices[i]);
//            product.setDiscount(10);
//            product.setSpecialPrice(prices[i] - (prices[i] * 0.1));
//            product.setQuantity(20);
//            product.setImage("default.png");
//            product.setCategory(category);
//
//            productRepository.save(product);
//        }
//    }
//}
